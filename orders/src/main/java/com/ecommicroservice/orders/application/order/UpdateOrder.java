package com.ecommicroservice.orders.application.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.UpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UpdateOrder {

  private final UpdateService<Order> updateService;

  public void update(Order order) {
    updateService.update(order);
  }

}
