package com.ecommicroservice.orders.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

  private String id;
  private String idClient;
  private String idProduct;
  private double totalAmount;

}
