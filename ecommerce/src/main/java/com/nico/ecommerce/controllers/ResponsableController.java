package com.nico.ecommerce.controllers;

import com.nico.ecommerce.dto.UserDTO;
import com.nico.ecommerce.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * REST CONTROLLER lié aux activités d'un responsable
 */
@RestController
@RequestMapping("/api")
public class ResponsableController {

    private static Logger LOGGER = LoggerFactory.getLogger(ResponsableController.class);

    @Autowired
    private UserService userService;

    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    @GetMapping("/users")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Iterable<UserDTO>> getUsers() {
        try {
            return ResponseEntity.ok(userService.getAll());
        } catch (Exception e) {
            LOGGER.error("Erreur lors de la récupération des users en base : {}", e.getMessage().toUpperCase());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/new-user")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<UserDTO> createUser(@RequestBody @Validated UserDTO userDTO) {
        try {
            LOGGER.info("L'administrateur {} enregistre un nouvel utilisateur au rôle {} du nom de {}",
                    auth.getPrincipal().toString().toUpperCase(), userDTO.getPoste().toUpperCase(), userDTO.getUsername().toUpperCase());
            userService.postUser(userDTO);
            return ResponseEntity.ok(userDTO);
        } catch (Exception e) {
            LOGGER.error("Erreur lors de l'enregistrement du user {} avec le rôle {} par l'administrateur {}",
                    userDTO.getUsername().toUpperCase(), userDTO.getPoste().toUpperCase(), auth.getPrincipal().toString().toUpperCase());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
