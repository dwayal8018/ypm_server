//package com.bluetech.protech.controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.bluetech.protech.Utils.JwtUtil;
//import com.bluetech.protech.pojo.User;
//import com.bluetech.protech.repository.UserRepository;
//
//@RestController
//@RequestMapping("/api")
//public class AuthController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
//            );
//
//            // Fetch user from the database
//            User user = userRepository.findByUserName(loginRequest.getUsername())
//                    .orElseThrow(() -> new RuntimeException("User not found"));
//
//            String token = jwtUtil.generateToken(user.getUsername(), user.getRole());
//
//            return ResponseEntity.ok(new LoginResponse(token, user.getRole()));
//        } catch (AuthenticationException e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }
//}
