package com.ecommicroservice.orders.shared.exception;


import lombok.Getter;

@Getter
public enum ExceptionCode {
  PRODUCT_NOT_FOUND("PNF-001", "NOT_FOUND"),
  CLIENT_NOT_FOUND("ERR-001", "CLIENT_NOT_FOUND"),
  CLIENT_INACTIVE("ERR-002", "CLIENT_INACTIVE");
  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}
