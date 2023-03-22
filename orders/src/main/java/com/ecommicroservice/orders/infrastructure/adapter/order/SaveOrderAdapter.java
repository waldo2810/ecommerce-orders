package com.ecommicroservice.orders.infrastructure.adapter.order;

import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.SaveService;
import com.ecommicroservice.orders.infrastructure.client.ProductClient;
import com.ecommicroservice.orders.infrastructure.client.ProductResponse;
import com.ecommicroservice.orders.infrastructure.dto.OrderDto;
import com.ecommicroservice.orders.infrastructure.dto.OrderMessageDto;
import com.ecommicroservice.orders.infrastructure.mapper.OrderMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderRepository;
import com.ecommicroservice.orders.shared.exception.ProductNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrderAdapter implements SaveService<Order> {

  private final OrderRepository orderRepository;
  private final OrderMapper orderMapper;
  private final RabbitTemplate rabbitTemplate;
  private final ProductClient productClient;

  @Override
  public Order save(Order itemToSave) {
    //validate product exists
    ProductResponse product = productClient.getProduct(itemToSave.getProductId());
    if (product == null){
      throw new ProductNotFoundException("Product with id: "+itemToSave.getProductId()+" does not exits.");
    }

    // Save order in the database
    OrderDto savedOrderDto = orderRepository.save(orderMapper.toDto(itemToSave));
    Order savedOrder = orderMapper.toEntity(savedOrderDto);

    // Send message to RabbitMQ
    OrderMessageDto message = new OrderMessageDto(savedOrderDto.getProductId(),
        savedOrderDto.getQuantity());
    rabbitTemplate.convertAndSend("orders-queue", message);

    return savedOrder;
  }
}
