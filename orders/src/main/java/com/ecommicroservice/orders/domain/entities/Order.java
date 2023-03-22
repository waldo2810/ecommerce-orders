package com.ecommicroservice.orders.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {

  private String id;
  private String productId;
  private String customer;
  private int quantity;
  private double totalAmount;

}
