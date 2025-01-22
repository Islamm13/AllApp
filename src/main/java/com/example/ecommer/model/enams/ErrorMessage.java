package com.example.ecommer.model.enams;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

public enum ErrorMessage {

    PRODUCT_NOT_FOUND("Product not found with id: %s");

    private final String message;

}
