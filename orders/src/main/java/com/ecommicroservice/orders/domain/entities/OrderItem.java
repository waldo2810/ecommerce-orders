package com.ecommicroservice.orders.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItem {

  private String id;
  private String productId;
  private int quantity;
  private double price;

}
