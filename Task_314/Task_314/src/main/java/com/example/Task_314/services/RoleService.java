package com.example.Task_314.services;

import com.example.Task_314.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAllRoles();

    void save(Role role);

    void deleteById(Long id);

    Optional<Role> showRoleById(Long id);
/*
List<Role> getAllUsers();

    void save(Role role);

    void deleteById(Long id);

    Role showUserById(Long id);
 */
}
