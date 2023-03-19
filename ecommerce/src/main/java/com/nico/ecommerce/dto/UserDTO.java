package com.nico.ecommerce.dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

    public UserDTO(String username, String poste) {
        this.username = username;
        this.poste = poste;
    }

    @Nonnull
    private String username;

    @Nonnull
    private String password;

    @Nonnull
    private String roles;

    @Nonnull
    private String poste;
}
