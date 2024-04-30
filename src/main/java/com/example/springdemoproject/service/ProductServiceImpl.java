package com.example.springdemoproject.service;

import com.example.springdemoproject.entity.ProductEntity;
import com.example.springdemoproject.dto.ProductCreateCommand;
import com.example.springdemoproject.handler.ProductCreateCommandHandler;
import com.example.springdemoproject.dto.ProductUpdateCommand;
import com.example.springdemoproject.ports.ProductService;
import com.example.springdemoproject.response.CreateProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductCreateCommandHandler productCreateCommandHandler;

    public ProductServiceImpl(ProductCreateCommandHandler productCreateCommandHandler) {
        this.productCreateCommandHandler = productCreateCommandHandler;
    }

    @Override
    public CreateProductResponse createProduct(ProductCreateCommand productCreateCommand) {
        return productCreateCommandHandler.createProduct(productCreateCommand);
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productCreateCommandHandler.getAllProducts();
    }

    @Override
    public CreateProductResponse deleteProduct(UUID id) {
        return productCreateCommandHandler.deleteProduct(id);
    }

    @Override
    public CreateProductResponse updateProduct(ProductUpdateCommand productUpdateCommand) {
        return productCreateCommandHandler.updateProduct(productUpdateCommand);
    }
}
