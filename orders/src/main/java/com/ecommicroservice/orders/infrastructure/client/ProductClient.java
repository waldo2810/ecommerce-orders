package com.ecommicroservice.orders.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-client", url = "localhost:8082")
public interface ProductClient {

  @GetMapping("/api/products/{id}")
  ProductResponse getProduct(@PathVariable("id") String id);
}
