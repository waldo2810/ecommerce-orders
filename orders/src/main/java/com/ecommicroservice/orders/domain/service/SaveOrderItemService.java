package com.ecommicroservice.orders.domain.service;

import com.ecommicroservice.orders.domain.entities.OrderItem;

public interface SaveOrderItemService {

  OrderItem save(OrderItem itemToSave);

}
