package com.csc3402.lab.lab08.security.formlogin.service;

import com.csc3402.lab.lab08.security.formlogin.dto.UserDto;
import com.csc3402.lab.lab08.security.formlogin.model.User;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
}