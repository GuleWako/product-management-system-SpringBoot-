package com.example.springdemoproject.repository;

import com.example.springdemoproject.entity.ProductEntity;

import com.example.springdemoproject.dto.ProductUpdateCommand;
import com.example.springdemoproject.ports.ProductRepository;
import com.example.springdemoproject.response.CreateProductResponse;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class RepositoryImpl implements ProductRepository {
    private final ProRepository proRepository;

    public RepositoryImpl(ProRepository proRepository) {
        this.proRepository = proRepository;
    }


    @Override
    public ProductEntity save(ProductEntity product) {
        return proRepository.save(product);
    }

    @Override
    public List<ProductEntity> findAll() {
        return proRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(UUID id) {
        return proRepository.findById(id);
    }

    @Override
    public CreateProductResponse deleteProduct(UUID id) {
        proRepository.deleteById(id);
        return new CreateProductResponse(
                id,
                "Deleted Successfully"
        );

    }

    @Override
    public CreateProductResponse updateProduct(ProductUpdateCommand productUpdateCommand) {
        proRepository.save(productUpdateCommand.getProductEntity());
        return new CreateProductResponse(
                productUpdateCommand.getProductEntity().getId(),
                "Updated Successfully"
        );
    }


}
