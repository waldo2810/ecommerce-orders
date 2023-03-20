package com.ecommicroservice.orders.infrastructure.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order_items")
public class OrderItemDto {

  @Id
  private String id;
  @Column(name = "product_id")
  private String productId;
  private int quantity;
  private double price;
}
