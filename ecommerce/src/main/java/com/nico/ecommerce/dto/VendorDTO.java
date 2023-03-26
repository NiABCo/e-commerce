package com.nico.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO vendeur
 */
@Data
@AllArgsConstructor
public class VendorDTO implements Serializable {

    private String firstName;

    private String lastName;

    private int vendorCode;

    private boolean isAuthorized;
}
