package com.nico.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
public class ProductDTO implements Serializable {
    private String productName;
    private int nbreEnStock;
    private int nbreEnCommande;
    private int NbreReserves;
}
