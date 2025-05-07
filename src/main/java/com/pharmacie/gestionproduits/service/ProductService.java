package com.pharmacie.gestionproduits.service;

import com.pharmacie.gestionproduits.model.Product;
import com.pharmacie.gestionproduits.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    private ProductRepository productRepository;


    //add products
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    //View all products
    public String printName(String name){
        return name.toUpperCase();
    }

    // Update products

    // Delete product


}
