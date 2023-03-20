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
@Table(name = "orders")
public class OrderDto {

  @Id
  private String id;
  private String customer;
  private String date;
  @Column(name = "total_amount")
  private double totalAmount;

}