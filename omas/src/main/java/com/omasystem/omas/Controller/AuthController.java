package com.omasystem.omas.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omasystem.omas.Dto.SignInDto;
import com.omasystem.omas.Service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/signin")
    public ResponseEntity<String> signIn(@RequestBody SignInDto signInDto) {
        String token = authService.signIn(signInDto.getUsername(), signInDto.getPassword());
        return ResponseEntity.ok(token);
    }
}
