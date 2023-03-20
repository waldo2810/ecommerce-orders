package com.ecommicroservice.orders.infrastructure.adapter.order;

import com.ecommicroservice.orders.domain.service.DeleteService;
import com.ecommicroservice.orders.infrastructure.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeleteOrderAdapter implements DeleteService {

  private final OrderRepository orderRepository;

  @Override
  public void delete(String id) {
    orderRepository.deleteById(id);
  }
}
