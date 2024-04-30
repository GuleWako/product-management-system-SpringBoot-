package com.example.springdemoproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    private UUID id;
    private String productName;
    private String productType;
    private float productPrice;
    private int productUnit;

}
