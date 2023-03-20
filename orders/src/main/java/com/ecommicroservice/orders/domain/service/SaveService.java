package com.ecommicroservice.orders.domain.service;

public interface SaveService<T> {

  T save(T itemToSave);

}
