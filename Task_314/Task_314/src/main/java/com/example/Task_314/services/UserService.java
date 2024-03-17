package com.example.Task_314.services;

import com.example.Task_314.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    void save(User user);

    void deleteById(Long id);

    Optional<User> showUserById(Long id);

    void update(Long id, User user);

   // User findByEmail(String email);

    UserDetails loadUserByUsername(String username);

}
