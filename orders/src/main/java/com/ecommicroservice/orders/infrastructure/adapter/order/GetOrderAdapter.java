package com.ecommicroservice.orders.infrastructure.adapter.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.GetService;
import com.ecommicroservice.orders.infrastructure.dto.OrderDto;
import com.ecommicroservice.orders.infrastructure.mapper.OrderMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetOrderAdapter implements GetService<Order> {

  private final OrderRepository orderRepository;
  private final OrderMapper orderMapper;

  @Override
  public List<Order> getAllItems() {
    List<OrderDto> dtoList = orderRepository.findAll();
    return dtoList.stream().map(orderMapper::toEntity).toList();
  }

  @Override
  public Order getItem(String id) {
    Optional<OrderDto> orderDtoOptional = orderRepository.findById(id);
    return orderDtoOptional.map(orderMapper::toEntity).orElse(null);
  }
}
