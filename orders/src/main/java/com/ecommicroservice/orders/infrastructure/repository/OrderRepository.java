package com.ecommicroservice.orders.infrastructure.repository;

import com.ecommicroservice.orders.infrastructure.dto.OrderDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDto, String> {

}
