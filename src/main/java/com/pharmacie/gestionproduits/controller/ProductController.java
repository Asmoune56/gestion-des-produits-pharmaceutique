package com.pharmacie.gestionproduits.controller;

import com.pharmacie.gestionproduits.model.Product;
import com.pharmacie.gestionproduits.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    // Ajouter un produit
    @PostMapping("/product")
    public Product SaveProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // Lister tous les produits
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Mettre à jour un produit
    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }


    // Supprimer un produit
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}
