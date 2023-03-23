package com.ecommicroservice.orders.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "order-client", url = "localhost:8084/cliente")
public interface ClientClient {
  @GetMapping( "/search/{id}")
  ClientResponse getCliente(@PathVariable("id") String id);
}
