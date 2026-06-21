package com.app.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.entity.Users;

public class UserInformation implements UserDetails {

    private Users user;

    public UserInformation(Users user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return Collections.singleton(
                new SimpleGrantedAuthority("USER")
        );
    }

    @Override
    public String getUsername() {

        return user.getName();
    }

    @Override
    public String getPassword() {

        return user.getPassword();
    }

}