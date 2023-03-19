package com.nico.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
            userService.postUser(new UserDTO("Nicolas Abbadie", "passwordNA", "ROLE_ADMIN", "Directeur"));
        };
    }*/
}
