package com.example.springdemoproject.mapper;

import com.example.springdemoproject.entity.ProductEntity;
import com.example.springdemoproject.dto.ProductCreateCommand;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductDataMapper {
    public ProductEntity productToEntity(ProductCreateCommand productCreateCommand) {
      return new ProductEntity(
              UUID.randomUUID(),
              productCreateCommand.getProductName(),
              productCreateCommand.getProductType(),
              productCreateCommand.getProductPrice(),
              productCreateCommand.getProductUnit()
      );
    }
}
