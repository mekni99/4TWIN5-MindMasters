package com.example.projet.Auth.registration.password;

import lombok.Data;

/**
 * @author Sampson Alfred
 */
@Data
public class PasswordRequestUtil {
    private String email;
    private String oldPassword;
    private String newPassword;
}
