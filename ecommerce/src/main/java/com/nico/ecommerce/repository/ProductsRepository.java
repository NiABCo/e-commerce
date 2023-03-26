package com.nico.ecommerce.repository;

import com.nico.ecommerce.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Product, Long> {
}
