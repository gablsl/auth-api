package com.gabriel.authtoken.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {}
