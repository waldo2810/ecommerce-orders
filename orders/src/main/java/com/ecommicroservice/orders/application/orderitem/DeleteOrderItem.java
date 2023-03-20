package com.ecommicroservice.orders.application.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.DeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeleteOrderItem {

  private final DeleteService<OrderItem> deleteService;

  public void delete(String id) {
    deleteService.delete(id);
  }
}
