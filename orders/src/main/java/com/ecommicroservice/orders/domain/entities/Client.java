package com.ecommicroservice.orders.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

  private String id;
  private String tipoId;
  private String nombre;
  private String apellido;
  private Boolean estado;
}
