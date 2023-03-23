package com.ecommicroservice.orders.infrastructure.client;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductResponse {

  private String id;
  private String name;
  private double price;
  private int stock;

}
