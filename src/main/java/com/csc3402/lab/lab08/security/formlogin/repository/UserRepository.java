package com.csc3402.lab.lab08.security.formlogin.repository;

import com.csc3402.lab.lab08.security.formlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}