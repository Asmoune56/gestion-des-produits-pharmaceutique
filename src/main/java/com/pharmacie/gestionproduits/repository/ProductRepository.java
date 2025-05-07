package com.pharmacie.gestionproduits.repository;

import com.pharmacie.gestionproduits.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
