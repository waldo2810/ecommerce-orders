package com.ecommicroservice.orders.infrastructure.api.controller;

import com.ecommicroservice.orders.application.order.DeleteOrder;
import com.ecommicroservice.orders.application.order.GetOrder;
import com.ecommicroservice.orders.application.order.SaveOrder;
import com.ecommicroservice.orders.application.order.UpdateOrder;
import com.ecommicroservice.orders.domain.entities.Order;
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
@RequestMapping("/api/orders")
public class OrderController {

  private final GetOrder getOrder;
  private final SaveOrder saveOrder;
  private final UpdateOrder updateOrder;
  private final DeleteOrder deleteOrder;

  @GetMapping
  public ResponseEntity<List<Order>> getAllProducts() {
    return ResponseEntity.ok(getOrder.getAllOrders());
  }

  @GetMapping("{id}")
  public ResponseEntity<Order> getOrderById(@PathVariable String id) {
    return ResponseEntity.ok(getOrder.getOrder(id));
  }

  @PostMapping
  public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
    return ResponseEntity.ok(saveOrder.save(order));
  }

  @PutMapping
  public void updateOrder(@RequestBody Order order) {
    updateOrder.update(order);
  }

  @DeleteMapping("{id}")
  public void deleteOrder(@PathVariable String id) {
    deleteOrder.delete(id);
  }
}
