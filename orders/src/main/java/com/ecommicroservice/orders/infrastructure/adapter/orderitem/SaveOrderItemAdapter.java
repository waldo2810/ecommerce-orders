package com.ecommicroservice.orders.infrastructure.adapter.orderitem;

import com.ecommicroservice.orders.domain.entities.OrderItem;
import com.ecommicroservice.orders.domain.service.SaveOrderItemService;
import com.ecommicroservice.orders.infrastructure.client.ProductClient;
import com.ecommicroservice.orders.infrastructure.client.ProductResponse;
import com.ecommicroservice.orders.infrastructure.mapper.OrderItemMapper;
import com.ecommicroservice.orders.infrastructure.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrderItemAdapter implements SaveOrderItemService {

  private final OrderItemRepository orderItemRepository;
  private final OrderItemMapper orderItemMapper;
  private final ProductClient productClient;

  @Override
  public OrderItem save(OrderItem itemToSave) {
    // Check if product exists
    ProductResponse productResponse = productClient.getProduct(itemToSave.getProductId());
    if (productResponse == null) {
      throw new RuntimeException("Product with id " + itemToSave.getProductId() + " not found.");
    }
    return orderItemMapper.toEntity(orderItemRepository.save(orderItemMapper.toDto(itemToSave)));
  }
}
