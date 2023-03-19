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
    private String password;
    private String roles;
    private String poste;

    public User() {
    }

    public User(String username, String password, String roles, String poste) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.poste = poste;
    }
}
