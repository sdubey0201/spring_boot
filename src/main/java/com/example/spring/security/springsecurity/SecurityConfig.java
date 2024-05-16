package com.example.spring.security.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        try {
            httpSecurity.authorizeHttpRequests().anyRequest().permitAll();
            return httpSecurity.build();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
