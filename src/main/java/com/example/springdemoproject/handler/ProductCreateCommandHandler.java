package com.example.springdemoproject.handler;

import com.example.springdemoproject.dto.ProductCreateCommand;
import com.example.springdemoproject.dto.ProductUpdateCommand;
import com.example.springdemoproject.entity.ProductEntity;
import com.example.springdemoproject.mapper.ProductDataMapper;
import com.example.springdemoproject.response.CreateProductResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ProductCreateCommandHandler {
    private final ProductDataMapper productDataMapper;
    private final ProductCreateReceiveHelper productCreateReceiveHelper;
    public ProductCreateCommandHandler(ProductDataMapper productDataMapper, ProductCreateReceiveHelper productCreateReceiveHelper, ProductCreateCommand productCreateCommand) {
        this.productDataMapper = productDataMapper;
        this.productCreateReceiveHelper = productCreateReceiveHelper;
    }

    public CreateProductResponse createProduct(ProductCreateCommand productCreateCommand) {
        ProductEntity productEntity = productDataMapper.productToEntity(productCreateCommand);
        return productCreateReceiveHelper.persistence(productEntity);
    }

    public List<ProductEntity> getAllProducts() {
        return productCreateReceiveHelper.getAllProducts();
    }


    public CreateProductResponse deleteProduct(UUID id) {
        return productCreateReceiveHelper.deleteProduct(id);
    }

    public CreateProductResponse updateProduct(ProductUpdateCommand productUpdateCommand) {
        return productCreateReceiveHelper.updateProduct(productUpdateCommand);
    }
}
