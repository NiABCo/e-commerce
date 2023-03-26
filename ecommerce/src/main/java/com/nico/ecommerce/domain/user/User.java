package com.nico.ecommerce.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Bean des users
 * Sera converti en {@link SecurityUser}
 */
@Entity
@Table(name = "users")
@Data
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;

    private String firstName;

    private String lastName;
    private String password;
    private String roles;
    private String poste;
    private String profil;

    public User() {
    }

    public User(String username, String firstName, String lastName, String password, String roles, String poste, String profil) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.roles = roles;
        this.poste = poste;
        this.profil = profil;
    }
}
