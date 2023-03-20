package com.ecommicroservice.orders.application.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.SaveOrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrderItem {

  private final SaveOrderItemService saveService;

  public OrderItem save(OrderItem orderItem) {
    return saveService.save(orderItem);
  }
}
