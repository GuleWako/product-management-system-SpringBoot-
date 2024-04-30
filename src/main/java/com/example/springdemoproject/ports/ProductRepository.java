package com.example.springdemoproject.ports;

import com.example.springdemoproject.entity.ProductEntity;
import com.example.springdemoproject.dto.ProductUpdateCommand;
import com.example.springdemoproject.response.CreateProductResponse;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {
    ProductEntity save(ProductEntity product);

    List<ProductEntity> findAll();


    Optional<ProductEntity> findById(UUID id);

    CreateProductResponse deleteProduct(UUID id);

    CreateProductResponse updateProduct(ProductUpdateCommand productUpdateCommand);
}
