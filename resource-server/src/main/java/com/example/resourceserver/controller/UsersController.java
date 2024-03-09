package com.example.resourceserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @PreAuthorize("hasAuthority('ROLE_developer')")
    @GetMapping("/status/check")
    public String status() {
        return "Working...";
    }

    @PreAuthorize("hasAuthority('ROLE_developer')")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        // Implementation to delete user with the specified ID
        return ResponseEntity.ok("User deleted successfully");
    }
}
