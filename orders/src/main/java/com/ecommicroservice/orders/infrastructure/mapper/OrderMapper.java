package com.ecommicroservice.orders.infrastructure.mapper;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.infrastructure.dto.OrderDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

  Order toEntity(OrderDto orderDto);

  OrderDto toDto(Order order);
}
