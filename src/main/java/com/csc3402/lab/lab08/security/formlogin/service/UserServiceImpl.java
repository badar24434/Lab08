package com.csc3402.lab.lab08.security.formlogin.service;

import com.csc3402.lab.lab08.security.formlogin.dto.UserDto;
import com.csc3402.lab.lab08.security.formlogin.model.Role;
import com.csc3402.lab.lab08.security.formlogin.model.User;
import com.csc3402.lab.lab08.security.formlogin.repository.RoleRepository;
import com.csc3402.lab.lab08.security.formlogin.repository.UserRepository;
import com.csc3402.lab.lab08.security.formlogin.util.TbConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UserDto userDto) {
        Role role = roleRepository.findByName(TbConstants.Roles.USER);
        if (role == null) {
            role = roleRepository.save(new Role(null, TbConstants.Roles.USER, null));
        }

        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        // Store password as plain text
        user.setPassword(userDto.getPassword());
        user.setRoles(Arrays.asList(role));

        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}