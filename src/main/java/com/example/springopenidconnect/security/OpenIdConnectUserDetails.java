package com.example.springopenidconnect.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

import java.util.Collection;

public class OpenIdConnectUserDetails implements UserDetails {
    private String userId;
    private String username;
    private OAuth2AccessToken token;

    public OpenIdConnectUserDetails(String userId, String username, OAuth2AccessToken token) {
        this.userId = userId;
        this.username = username;
        this.token = token;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
