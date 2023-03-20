package com.ecommicroservice.orders.domain.service;

public interface UpdateService<T> {

  void update(T itemToUpdate);

}
