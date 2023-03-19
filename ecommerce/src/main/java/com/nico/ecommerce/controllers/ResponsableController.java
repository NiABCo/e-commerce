package com.nico.ecommerce.controllers;

import com.nico.ecommerce.domain.user.User;
import com.nico.ecommerce.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST CONTROLLER lié aux activités d'un responsable
 */
@RestController
@RequestMapping("/api")
public class ResponsableController {

    private static Logger LOGGER = LoggerFactory.getLogger(ResponsableController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Iterable<User>> getUsers() {
        try {
            return ResponseEntity.ok(userRepository.findAll());
        } catch (Exception e) {
            LOGGER.error("Erreur lors de la récupération des users en base : {}", e.getMessage().toUpperCase());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
