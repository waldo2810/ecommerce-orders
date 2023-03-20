package com.ecommicroservice.orders.infrastructure.mapper;

import com.ecommicroservice.orders.domain.entities.Product;
import com.ecommicroservice.orders.infrastructure.client.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

  Product toEntity(ProductResponse productResponse);

  ProductResponse toResponse(Product product);
}
