package com.ecommicroservice.orders.infrastructure.mapper;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.infrastructure.dto.OrderItemDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

  OrderItem toEntity(OrderItemDto orderItemDto);

  OrderItemDto toDto(OrderItem orderItem);
}
