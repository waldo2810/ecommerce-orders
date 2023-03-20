package com.ecommicroservice.orders.infrastructure.api.controller;

import com.ecommicroservice.orders.application.orderitem.DeleteOrderItem;
import com.ecommicroservice.orders.application.orderitem.GetOrderItem;
import com.ecommicroservice.orders.application.orderitem.SaveOrderItem;
import com.ecommicroservice.orders.application.orderitem.UpdateOrderItem;
import com.ecommicroservice.orders.domain.entities.OrderItem;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/orderItems")
public class OrderItemController {

  private final GetOrderItem getOrder;
  private final SaveOrderItem saveOrder;
  private final UpdateOrderItem updateOrder;
  private final DeleteOrderItem deleteOrder;

  @GetMapping
  public ResponseEntity<List<OrderItem>> getAllProducts() {
    return ResponseEntity.ok(getOrder.getAllOrderItems());
  }

  @GetMapping("{id}")
  public ResponseEntity<OrderItem> getOrderItemById(@PathVariable String id) {
    return ResponseEntity.ok(getOrder.getOrderItem(id));
  }

  @PostMapping
  public ResponseEntity<OrderItem> saveOrderItem(@RequestBody OrderItem orderItem) {
    return ResponseEntity.ok(saveOrder.save(orderItem));
  }

  @PutMapping
  public void updateOrderItem(@RequestBody OrderItem orderItem) {
    updateOrder.update(orderItem);
  }

  @DeleteMapping("{id}")
  public void deleteOrderItem(@PathVariable String id) {
    deleteOrder.delete(id);
  }
}

