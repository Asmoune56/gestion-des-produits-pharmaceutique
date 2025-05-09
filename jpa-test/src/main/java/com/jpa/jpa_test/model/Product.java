package com.jpa.jpa_test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



    @Entity
    public class Product {
        @Id
        @GeneratedValue
        private Long id;
        private String name;
        private String category;
        private double price;


    }


