package com.ecommicroservice.orders.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

  private String id;
  private String customer;
  private String date;
  private double totalAmount;

}
