package com.example.ecommer.service.concrete;

import com.example.ecommer.exception.NotFoundException;
import com.example.ecommer.model.request.CreateProductRequest;
import com.example.ecommer.model.response.ProductResponse;
import com.example.ecommer.repository.ProductRepository;
import com.example.ecommer.service.abstraction.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.ecommer.mapper.ProductMapper.PRODUCT_MAPPER;
import static com.example.ecommer.model.enams.ErrorMessage.PRODUCT_NOT_FOUND;

@Service
@RequiredArgsConstructor

public class ProductServiceHandler  implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public void createProduct(CreateProductRequest createProductRequest) {
        productRepository.save
                (PRODUCT_MAPPER.buildProductEntity(createProductRequest));
    }

    @Override
    public ProductResponse getProductById(Long id){
        return productRepository.findById(id)
                .map(PRODUCT_MAPPER::buildProductResponse)
                .orElseThrow(() -> new NotFoundException(String
                                .format(PRODUCT_NOT_FOUND.getMessage(),id
                        )
                )
                );
    }
}
