package com.ecommicroservice.orders.infrastructure.mapper;

import com.ecommicroservice.orders.domain.entities.Client;
import com.ecommicroservice.orders.infrastructure.client.ClientResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ClientMapper {
  Client toEntity(ClientResponse clientResponse);
  ClientResponse toResponse(Client client);
}
