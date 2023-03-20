package com.ecommicroservice.orders.infrastructure.repository;

import com.ecommicroservice.orders.infrastructure.dto.OrderItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemDto, String> {

}
