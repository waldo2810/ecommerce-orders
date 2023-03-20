package com.ecommicroservice.orders.infrastructure.adapter.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.SaveService;
import com.ecommicroservice.orders.infrastructure.mapper.OrderMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrderAdapter implements SaveService<Order> {

  private final OrderRepository orderRepository;
  private final OrderMapper orderMapper;

  @Override
  public Order save(Order itemToSave) {
    return orderMapper.toEntity(orderRepository.save(orderMapper.toDto(itemToSave)));
  }
}
