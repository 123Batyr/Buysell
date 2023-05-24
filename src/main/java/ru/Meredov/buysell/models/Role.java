package ru.Meredov.buysell.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_User, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
