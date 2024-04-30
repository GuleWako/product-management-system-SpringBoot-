package com.example.springdemoproject.dto;
import lombok.*;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class ProductCreateCommand {
    private String productName;
    private String productType;
    private float productPrice;
    private int productUnit;

}
