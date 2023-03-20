package com.ecommicroservice.orders.infrastructure.adapter.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.UpdateService;
import com.ecommicroservice.orders.infrastructure.mapper.OrderMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UpdateOrderAdapter implements UpdateService<Order> {

  private final OrderRepository orderRepository;
  private final OrderMapper orderMapper;

  @Override
  public void update(Order itemToUpdate) {
    orderRepository.save(orderMapper.toDto(itemToUpdate));
  }
}
