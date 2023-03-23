package com.ecommicroservice.orders.infrastructure.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "orders")
public class OrderDto {

  @Id
  private String id;
  @Column(name = "product_id")
  private String productId;
  private String idClient;
  private String customer;
  private int quantity;
  @Column(name = "total_amount")
  private double totalAmount;

}
