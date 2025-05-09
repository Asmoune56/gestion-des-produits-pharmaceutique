package com.pharmacie.gestionproduits.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product-db")
public class Product {

    @Id
    private Long id;
    private String name;
    private int quantity;
    private double price;
    private String description;
}
