package com.example.ecommer.controller;

import com.example.ecommer.model.request.CreateProductRequest;
import com.example.ecommer.model.response.ProductResponse;
import com.example.ecommer.service.abstraction.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/prducts")
@RequiredArgsConstructor

public class ProductController {

    private ProductService productService;

    @PostMapping("/createProduct")
    @ResponseStatus(HttpStatus.CREATED)
    private void createdProduct(@RequestBody CreateProductRequest createProductRequest){
        productService.createProduct(createProductRequest);
    }

    @GetMapping("/{id}")
    public ProductResponse getProduct (@PathVariable Long id){
        return (ProductResponse) productService.getProductById(id);
    }

}
