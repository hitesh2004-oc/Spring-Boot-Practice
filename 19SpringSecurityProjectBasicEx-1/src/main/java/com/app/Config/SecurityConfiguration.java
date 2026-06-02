package com.app.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // Disable CSRF Token
        http.csrf(customizer -> customizer.disable());

        // Enable HTTP Basic Authentication
        http.httpBasic(Customizer.withDefaults());

        // Stateless Session
        http.sessionManagement(
                session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );

        return http.build();
    }

    @Bean
    public UserDetailsService userDetails() {

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("Hitesh Malviya")
                .password("Hitesh123")
                .roles("Admin")
                .build();

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("Vinod")
                .password("Vinod123")
                .roles("User")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }
}