package com.ecommicroservice.orders.infrastructure.adapter.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.UpdateService;
import com.ecommicroservice.orders.infrastructure.mapper.OrderItemMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UpdateOrderItemAdapter implements UpdateService<OrderItem> {

  private final OrderItemRepository orderItemRepository;
  private final OrderItemMapper orderItemMapper;

  @Override
  public void update(OrderItem itemToUpdate) {
    orderItemRepository.save(orderItemMapper.toDto(itemToUpdate));
  }
}
