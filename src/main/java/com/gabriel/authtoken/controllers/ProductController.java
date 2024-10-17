package com.gabriel.authtoken.controllers;

import com.gabriel.authtoken.domain.product.Product;
import com.gabriel.authtoken.domain.product.ProductRequestDTO;
import com.gabriel.authtoken.domain.product.ProductResponseDTO;
import com.gabriel.authtoken.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO body) {
        Product newProduct = new Product(body);

        this.productRepository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getProducts() {
        List<ProductResponseDTO> productsList = this.productRepository
                .findAll()
                .stream()
                .map(ProductResponseDTO::new)
                .toList();

        return ResponseEntity.ok(productsList);
    }
}
