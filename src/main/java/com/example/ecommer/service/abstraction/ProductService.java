package com.example.ecommer.service.abstraction;

import com.example.ecommer.model.request.CreateProductRequest;
import com.example.ecommer.model.response.ProductResponse;

public interface ProductService {
    void createProduct(CreateProductRequest createProductRequest);


    ProductResponse getProductById(Long id);
}
