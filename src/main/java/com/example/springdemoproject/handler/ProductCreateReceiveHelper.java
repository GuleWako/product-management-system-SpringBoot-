package com.example.springdemoproject.handler;
import com.example.springdemoproject.dto.ProductUpdateCommand;
import com.example.springdemoproject.entity.ProductEntity;
import com.example.springdemoproject.ports.ProductRepository;
import com.example.springdemoproject.response.CreateProductResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProductCreateReceiveHelper {
    private final ProductRepository productRepository;
    public ProductCreateReceiveHelper(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public CreateProductResponse persistence(ProductEntity product) {

        ProductEntity productEntity = productRepository.save(product);

       return new CreateProductResponse(
               productEntity.getId(),
               "Product Created Successfully");
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public CreateProductResponse deleteProduct(UUID id) {
        Optional<ProductEntity> productEntity = productRepository.findById(id);
        if(productEntity==null){
            return new CreateProductResponse(id,
                    "product with this id doesn't exist");
        }else{
            return productRepository.deleteProduct(id);
        }

    }

    public CreateProductResponse updateProduct(ProductUpdateCommand productUpdateCommand) {
        Optional<ProductEntity> productEntity = productRepository.findById(productUpdateCommand.getProductEntity().getId());
        if(productEntity==null){
            return new CreateProductResponse(productUpdateCommand.getProductEntity().getId(),
                    "product with this id doesn't exist");
        }else{
            return productRepository.updateProduct(productUpdateCommand);
        }
    }
}
