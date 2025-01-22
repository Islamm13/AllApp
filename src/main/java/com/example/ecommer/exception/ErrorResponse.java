package com.example.ecommer.exception;

import lombok.Builder;

@Builder
public record ErrorResponse(String message) {
}
