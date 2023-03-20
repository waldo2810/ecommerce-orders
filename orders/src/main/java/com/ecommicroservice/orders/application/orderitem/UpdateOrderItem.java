package com.ecommicroservice.orders.application.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.UpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UpdateOrderItem {

  private final UpdateService<OrderItem> updateService;

  public void update(OrderItem orderItem) {
    updateService.update(orderItem);
  }

}
