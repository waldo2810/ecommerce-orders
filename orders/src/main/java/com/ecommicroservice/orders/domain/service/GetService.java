package com.ecommicroservice.orders.domain.service;

import java.util.List;

public interface GetService<T> {

  List<T> getAllItems();

  T getItem(String id);

}