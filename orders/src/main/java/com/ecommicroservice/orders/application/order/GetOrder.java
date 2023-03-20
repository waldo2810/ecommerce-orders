package com.ecommicroservice.orders.application.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.GetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetOrder {

  private final GetService<Order> getService;

  public List<Order> getAllOrders() {
    return getService.getAllItems();
  }

  public Order getOrder(String id) {
    return getService.getItem(id);
  }
}
