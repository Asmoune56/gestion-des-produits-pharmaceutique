package com.jpa.jpa_test.repository;

import com.jpa.jpa_test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

List<Product> findByCategory(String category);

List<Product> findBymaxprice(double maxprice);

List<Product> findByName(String name);

}
