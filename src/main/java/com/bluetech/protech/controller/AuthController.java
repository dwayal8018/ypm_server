package com.bluetech.protech.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.LoginRequest;
import com.bluetech.protech.pojo.User;
import com.bluetech.protech.service.UserService;

//@RestController
//@RequestMapping("/api")
//public class AuthController {

//    @Autowired
//    private AuthenticationManager authenticationManager;

//    @Autowired
//    private JwtUtil jwtUtil;

//	@Autowired
//	private UserService userService;
//
//	@PostMapping("/login")
//	public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
//            );

		// Fetch user from the database
//		User user = userService.findByUserNameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
//				.orElseThrow(() -> new RuntimeException("User not found"));

//            String token = jwtUtil.generateToken(user.getUsername(), user.getRole());

//		return ResponseEntity.ok(user.getRole());
//            return ResponseEntity.ok(new LoginResponse(token, user.getRole()));
//        } catch (AuthenticationException e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//	}
//}
