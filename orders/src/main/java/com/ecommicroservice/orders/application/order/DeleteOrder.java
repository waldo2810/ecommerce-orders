package com.ecommicroservice.orders.application.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.DeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeleteOrder {

  private final DeleteService<Order> deleteService;

  public void delete(String id) {
    deleteService.delete(id);
  }
}
