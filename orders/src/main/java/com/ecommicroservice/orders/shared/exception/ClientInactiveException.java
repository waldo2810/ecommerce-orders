package com.ecommicroservice.orders.shared.exception;

import org.springframework.http.HttpStatus;

public class ClientInactiveException extends BaseException {

  public ClientInactiveException(String message) {
    super(false, HttpStatus.NOT_ACCEPTABLE, message, ExceptionCode.CLIENT_INACTIVE);
  }
}
