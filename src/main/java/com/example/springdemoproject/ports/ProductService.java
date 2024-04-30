package com.example.springdemoproject.ports;

import com.example.springdemoproject.entity.ProductEntity;
import com.example.springdemoproject.dto.ProductCreateCommand;
import com.example.springdemoproject.dto.ProductUpdateCommand;
import com.example.springdemoproject.response.CreateProductResponse;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    CreateProductResponse createProduct(ProductCreateCommand productCreateCommand);

    List<ProductEntity> getAllProducts();

    CreateProductResponse deleteProduct(UUID id);

    CreateProductResponse updateProduct(ProductUpdateCommand productUpdateCommand);
}
