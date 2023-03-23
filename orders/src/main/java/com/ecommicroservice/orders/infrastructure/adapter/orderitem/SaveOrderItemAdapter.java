package com.ecommicroservice.orders.infrastructure.adapter.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.SaveOrderItemService;
import com.ecommicroservice.orders.infrastructure.mapper.OrderItemMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrderItemAdapter implements SaveOrderItemService {

  private final OrderItemRepository orderItemRepository;
  private final OrderItemMapper orderItemMapper;

  @Override
  public OrderItem save(OrderItem itemToSave) {
    return orderItemMapper.toEntity(orderItemRepository.save(orderItemMapper.toDto(itemToSave)));
  }
}
