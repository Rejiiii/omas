package com.omasystem.omas.Service;

import org.springframework.stereotype.Service;

import com.omasystem.omas.Entity.User;
import com.omasystem.omas.Exceptions.UserNotFoundException;
import com.omasystem.omas.Repo.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String signIn(String username, String password) {
        // Find user by username
        try{
            User user = userRepository.findByUsername(username)
                    .orElseThrow(() -> new UserNotFoundException("User not found"));
    

        }
        catch (Exception x){
            System.out.print(x.getMessage());
        }

        // Return success message or token if needed
        return "Login successful";
    }

}
