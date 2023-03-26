package com.nico.ecommerce;

import com.nico.ecommerce.dto.UserDTO;
import com.nico.ecommerce.service.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(ProductsRepository productsRepository) {
        return args -> {
            productsRepository.save(new Product("Quartz canapé angle gauche gris", 2, 3, 1));
            productsRepository.save(new Product("Bomba matelas 140x190", 5, 5, 4));
        };
    }

    @Bean
    CommandLineRunner commandLineRunner(UserService userService) {
        return args -> {
            userService.postUser(new UserDTO("Nicolas", "Abbadie", "passwordNA", "ROLE_ADMIN",  "directeur", "direction"));
            userService.postUser(new UserDTO("Amandine", "Lafon", "passwordAL", "ROLE_ADMIN",  "responsable meuble", "vente"));
            userService.postUser(new UserDTO("Rodolphe", "Angibert", "passwordRA", "ROLE_USER",  "Vendeur meuble", "vente"));
            userService.postUser(new UserDTO("Elodie", "Morisan", "passwordEM", "ROLE_ADMIN",  "responsable caisse", "caisse"));
            userService.postUser(new UserDTO("Agnes", "nom", "passwordAN", "ROLE_USER",  "Hote caisse", "caisse"));
            userService.postUser(new UserDTO("Renaud", "Perez", "passwordRP", "ROLE_ADMIN",  "responsable depot", "depot"));
            userService.postUser(new UserDTO("Djibril", "Daoud", "passwordDD", "ROLE_USER",  "agent depot", "depot"));
            userService.postUser(new UserDTO("Nathalie", "Desaivre", "passwordND", "ROLE_USER",  "Vendeur LS", "vente"));

        };
    }*/
}
