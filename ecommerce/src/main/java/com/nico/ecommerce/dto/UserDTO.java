package com.nico.ecommerce.dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class UserDTO implements Serializable {

    @Nonnull
    private String firstName;

    @Nonnull
    private String lastName;

    @Nonnull
    private String password;

    @Nonnull
    private String roles;

    @Nonnull
    private String poste;

    @Nonnull
    private String profil;

    /**
     * Constructeur de renvoi des données du User vers le front
     *
     * @param firstName
     * @param lastName
     * @param poste
     * @param profil
     */
    public UserDTO(String firstName, String lastName, String password, String poste, String profil) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.poste = poste;
        this.profil = profil;
    }

    public UserDTO(String firstName, String lastName, String poste, String profil) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.poste = poste;
        this.profil = profil;
    }
}
