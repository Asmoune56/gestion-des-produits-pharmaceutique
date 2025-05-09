package com.jpa.jpa_test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class item {
 @Id
  @GeneratedValue

  private int id;
 private String name;
 private String category;
 private double price;

}
