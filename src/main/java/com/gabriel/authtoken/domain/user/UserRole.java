package com.gabriel.authtoken.domain.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserRole {

    @JsonProperty("admin")
    ADMIN("admin"),
    @JsonProperty("user")
    USER("user");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
