package com.ecommicroservice.orders.infrastructure.adapter.client;

import com.ecommicroservice.orders.domain.entities.Client;
import com.ecommicroservice.orders.domain.service.ClientGetService;
import com.ecommicroservice.orders.infrastructure.client.ClientClient;
import com.ecommicroservice.orders.infrastructure.mapper.ClientMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientGetAdapter implements ClientGetService {
  private final ClientClient clientClient;
  private final ClientMapper clientMapper;

  @Override
  public Client getClient(String id) {
    return clientMapper.toEntity(clientClient.getCliente(id));
  }
}
