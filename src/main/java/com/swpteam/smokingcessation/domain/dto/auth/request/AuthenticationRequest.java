package com.swpteam.smokingcessation.domain.dto.auth.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AuthenticationRequest(

        @NotBlank(message = "EMAIL_REQUIRED")
        @Email(message = "INVALID_EMAIL_FORMAT")
        String email,

        @NotBlank(message = "PASSWORD_REQUIRED")
        String password
) {}
