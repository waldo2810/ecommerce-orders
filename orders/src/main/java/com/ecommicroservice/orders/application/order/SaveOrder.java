package com.ecommicroservice.orders.application.order;

import com.ecommicroservice.orders.domain.entities.Client;
import com.ecommicroservice.orders.domain.entities.Order;
import com.ecommicroservice.orders.domain.service.ClientGetService;
import com.ecommicroservice.orders.domain.service.SaveService;
import com.ecommicroservice.orders.shared.exception.ClientInactiveException;
import com.ecommicroservice.orders.shared.exception.ClientNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveOrder {

  private final SaveService<Order> saveService;
  private final ClientGetService clientGetService;

  public Order save(Order order, String id) {
    Client cliente = clientGetService.getClient(id);
    if(cliente == null){
      throw new ClientNotFoundException("No existe un cliente con la Id ingresada");
    }
    if(!cliente.getEstado()){
      throw new ClientInactiveException("El cliente se encuentra inactivo");
    }
    return saveService.save(order);
  }
}
