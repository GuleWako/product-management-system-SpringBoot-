package com.example.springdemoproject.response;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class CreateProductResponse {
     private UUID id;
    private String message;
}
