package com.ecommicroservice.orders.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "order-client", url = "localhost:8080/cliente")
public interface ClientClient {
  @RequestMapping(method = RequestMethod.GET, value = "/search/{id}")
  ClientResponse getCliente(@PathVariable("id") String id);
}
