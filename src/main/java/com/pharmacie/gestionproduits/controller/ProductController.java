package com.pharmacie.gestionproduits.controller;

import com.pharmacie.gestionproduits.model.Product;
import com.pharmacie.gestionproduits.repository.ProductRepository;
import com.pharmacie.gestionproduits.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //add product
    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
    //View all products
    @GetMapping("/products")
public List<Product> getProduct(String name){
    return productRepository.findAll();
}
    // Update products
    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product){
       return productRepository.save(product);
    }

    // Delete product
    @DeleteMapping("/product/{id}")
    public void  deleteProduct(@PathVariable Long id){
        productRepository.deleteById(id);
    }

}
