package com.nico.ecommerce.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "produits")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String productName;
    private int nbreEnStock;
    private int nbreEnCommande;
    private int nbreReserves;

    public Product(String productName, int nbreEnStock, int nbreEnCommande, int nbreReserves) {
        this.productName = productName;
        this.nbreEnStock = nbreEnStock;
        this.nbreEnCommande = nbreEnCommande;
        this.nbreReserves = nbreReserves;
    }
}
