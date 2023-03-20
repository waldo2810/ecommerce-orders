package com.ecommicroservice.orders.application.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.GetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetOrderItem {

  private final GetService<OrderItem> getService;

  public List<OrderItem> getAllOrderItems() {
    return getService.getAllItems();
  }

  public OrderItem getOrderItem(String id) {
    return getService.getItem(id);
  }
}
