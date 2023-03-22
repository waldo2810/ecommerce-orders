package com.ecommicroservice.orders.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

  private String id;
  private String name;
  private double price;
  private int stock;
}
