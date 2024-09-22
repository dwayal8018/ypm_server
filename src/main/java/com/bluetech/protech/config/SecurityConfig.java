//package com.bluetech.protech.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import com.bluetech.protech.Utils.JwtUtil;
//import com.bluetech.protech.filter.JwtAuthenticationFilter;
//import com.bluetech.protech.service.impl.CustomUserDetailsServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	@Autowired
//	private CustomUserDetailsServiceImpl userDetailsService;
//
//	@Autowired
//	private JwtUtil jwtUtil;
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@SuppressWarnings("removal")
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.csrf().disable()
//				.authorizeHttpRequests(
//						authz -> authz.requestMatchers("/api/login").permitAll().anyRequest().authenticated())
//				.addFilterBefore(new JwtAuthenticationFilter(jwtUtil, userDetailsService),
//						UsernamePasswordAuthenticationFilter.class);
//
//		return http.build();
//	}
//
//	@SuppressWarnings("removal")
//	@Bean
//	public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
//		return http.getSharedObject(AuthenticationManagerBuilder.class).userDetailsService(userDetailsService)
//				.passwordEncoder(passwordEncoder()).and().build();
//	}
//
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedOrigins("http://localhost:4200") // Angular app URL
//						.allowedMethods("*").allowedHeaders("*");
//			}
//		};
//	}
//}
