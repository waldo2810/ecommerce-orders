package com.ecommicroservice.orders.application.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.SaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrderItem {

  private final SaveService<OrderItem> saveService;

  public OrderItem save(OrderItem orderItem) {
    return saveService.save(orderItem);
  }
}
