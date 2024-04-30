package com.example.springdemoproject.repository;

import com.example.springdemoproject.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProRepository extends JpaRepository<ProductEntity, UUID> {
}
