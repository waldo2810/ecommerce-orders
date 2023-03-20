package com.ecommicroservice.orders.infrastructure.client;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductResponse {

  private String id;
  private String name;
  private String description;
  private double price;
  private String category;
  private int stock;

}
