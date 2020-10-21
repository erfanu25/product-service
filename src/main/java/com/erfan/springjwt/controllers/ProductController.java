package com.erfan.springjwt.controllers;

import com.erfan.springjwt.models.Product;
import com.erfan.springjwt.payload.request.SignupRequest;
import com.erfan.springjwt.payload.response.MessageResponse;
import com.erfan.springjwt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody Product product) {
        productRepository.save(product);
        return ResponseEntity.ok(new MessageResponse("New Product created successfully!"));
    }

    @PutMapping("/update/{productId}")
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<Object> updateUser(@RequestBody Product product, @PathVariable long productId) {
        product.setId(productId);
        productRepository.save(product);
        return ResponseEntity.ok(new MessageResponse("Product updated successfully!"));
    }

}

