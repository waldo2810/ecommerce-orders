package com.ecommicroservice.orders.domain.service;

import com.ecommicroservice.orders.domain.entities.Client;

public interface ClientGetService {

  Client getClient(String id);
}
