package com.ecommicroservice.orders.infrastructure.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {

  private String id;
  private String tipoId;
  private String nombre;
  private String apellido;
  private Boolean estado;
}
