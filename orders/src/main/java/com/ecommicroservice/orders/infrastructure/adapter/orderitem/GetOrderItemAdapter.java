package com.ecommicroservice.orders.infrastructure.adapter.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.GetService;
import com.ecommicroservice.orders.infrastructure.dto.OrderItemDto;
import com.ecommicroservice.orders.infrastructure.mapper.OrderItemMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderItemRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetOrderItemAdapter implements GetService<OrderItem> {

  private final OrderItemRepository orderItemRepository;
  private final OrderItemMapper orderItemMapper;

  @Override
  public List<OrderItem> getAllItems() {
    List<OrderItemDto> dtoList = orderItemRepository.findAll();
    return dtoList.stream().map(orderItemMapper::toEntity).toList();
  }

  @Override
  public OrderItem getItem(String id) {
    Optional<OrderItemDto> orderDtoOptional = orderItemRepository.findById(id);
    return orderDtoOptional.map(orderItemMapper::toEntity).orElse(null);
  }
}
