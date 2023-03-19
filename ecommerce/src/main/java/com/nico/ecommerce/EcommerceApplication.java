package com.nico.ecommerce;

import com.nico.ecommerce.domain.user.User;
import com.nico.ecommerce.repository.UserRepository;
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
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("Nicolas Abbadie", "passwordNA", "ROLE_ADMIN", "Directeur"));
            userRepository.save(new User("Emilie Marenc", "passwordEM", "ROLE_ADMIN", "Responsable Meuble"));
            userRepository.save(new User("Adrien Pareil", "passwordAP", "ROLE_ADMIN", "Responsable Eelectro-ménager"));
        };
    }*/
}
