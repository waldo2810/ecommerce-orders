package com.ecommicroservice.orders.infrastructure.adapter.product;

import com.ecommicroservice.orders.domain.entities.Product;
import com.ecommicroservice.orders.domain.service.GetService;
import com.ecommicroservice.orders.infrastructure.client.ProductClient;
import com.ecommicroservice.orders.infrastructure.mapper.ProductMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetProductAdapter implements GetService<Product> {

  private final ProductClient productClient;
  private final ProductMapper productMapper;

  @Override
  public Product getItem(String id) {
    return productMapper.toEntity(productClient.getProduct(id));
  }

  @Override
  public List<Product> getAllItems() {
    return null;
  }
}
