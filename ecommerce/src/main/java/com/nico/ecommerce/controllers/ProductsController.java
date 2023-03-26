package com.nico.ecommerce.controllers;

import com.nico.ecommerce.dto.ProductDTO;
import com.nico.ecommerce.service.products.ProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductsController {

    private static Logger LOGGER = LoggerFactory.getLogger(ProductsController.class);

    @Autowired
    private ProductsService productsService;

    @GetMapping("/products")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        try {
            return ResponseEntity.ok(productsService.getAll());
        } catch (Exception e) {
            LOGGER.error("Erreur lors de la récupération des produits : {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
