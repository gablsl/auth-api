package com.gabriel.authtoken.repositories;

import com.gabriel.authtoken.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {}
