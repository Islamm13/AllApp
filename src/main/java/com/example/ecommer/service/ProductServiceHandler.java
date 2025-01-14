package com.example.ecommer.service;

import com.example.ecommer.mapper.ProductMapper;
import com.example.ecommer.model.request.CreateProductRequest;
import com.example.ecommer.repository.ProductRepository;
import com.example.ecommer.service.abstraction.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ProductServiceHandler  implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public void createProduct(CreateProductRequest createProductRequest) {
        productRepository.save
                (ProductMapper.
                        PRODUCT_MAPPER.buildProductEntity(createProductRequest));
    }

    @Override
    public Object getProductById(Long id) {
        return null;
    }
}
