package com.ecommicroservice.orders.infrastructure.adapter.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.DeleteService;
import com.ecommicroservice.orders.infrastructure.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeleteOrderItemAdapter implements DeleteService<OrderItem> {

  private final OrderItemRepository orderItemRepository;

  @Override
  public void delete(String id) {
    orderItemRepository.deleteById(id);
  }
}
