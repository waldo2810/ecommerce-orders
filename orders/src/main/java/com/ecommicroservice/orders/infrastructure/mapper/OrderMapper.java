package com.ecommicroservice.orders.infrastructure.mapper;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.infrastructure.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

  @Mapping(target = "id", source = "id")
  @Mapping(target = "customer", source = "customer")
  @Mapping(target = "date", source = "date")
  @Mapping(target = "totalAmount", source = "totalAmount")
  Order toEntity(OrderDto orderDto);

  @Mapping(target = "id", source = "id")
  @Mapping(target = "customer", source = "customer")
  @Mapping(target = "date", source = "date")
  @Mapping(target = "totalAmount", source = "totalAmount")
  OrderDto toDto(Order order);
}
