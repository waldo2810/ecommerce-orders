package com.ecommicroservice.orders.application.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.SaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrder {

  private final SaveService<Order> saveService;

  public Order save(Order order) {
    return saveService.save(order);
  }
}
