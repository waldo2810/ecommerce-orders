package com.ecommicroservice.orders.shared.exception;

import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends BaseException {

  public ProductNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.PRODUCT_NOT_FOUND);
  }
}
