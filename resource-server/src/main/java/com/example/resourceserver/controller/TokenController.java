package com.example.resourceserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/token")
public class TokenController {

    @GetMapping
    public ResponseEntity<Map<String, Object>> getToken(@AuthenticationPrincipal Jwt jwt) {
        return ResponseEntity.ok(Collections.singletonMap("principal", jwt));
    }
}
