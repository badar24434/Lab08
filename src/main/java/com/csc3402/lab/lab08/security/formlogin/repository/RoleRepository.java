package com.csc3402.lab.lab08.security.formlogin.repository;

import com.csc3402.lab.lab08.security.formlogin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}