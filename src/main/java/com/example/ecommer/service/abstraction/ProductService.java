package com.example.ecommer.service.abstraction;

import com.example.ecommer.model.request.CreateProductRequest;

public interface ProductService {
    void createProduct(CreateProductRequest createProductRequest);

    Object getProductById(Long id);
}
