package com.example.springdemoproject.dto;

import com.example.springdemoproject.entity.ProductEntity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductUpdateCommand {
    private ProductEntity productEntity;
}
