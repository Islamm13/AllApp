package com.example.ecommer.mapper;

import com.example.ecommer.entity.ProductEntity;
import com.example.ecommer.model.request.CreateProductRequest;

public enum ProductMapper {

    PRODUCT_MAPPER;

    public ProductEntity buildProductEntity(CreateProductRequest createProductRequest){
        return ProductEntity.builder()
                .name(createProductRequest.getName())
                .description(createProductRequest.getDescription())
                .price(createProductRequest.getPrice())
                .quantity(createProductRequest.getQuantity())
                .build();
    }
}
