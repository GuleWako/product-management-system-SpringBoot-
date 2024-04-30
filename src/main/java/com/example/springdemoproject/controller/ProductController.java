package com.example.springdemoproject.controller;

import com.example.springdemoproject.entity.ProductEntity;
import com.example.springdemoproject.dto.ProductCreateCommand;
import com.example.springdemoproject.dto.ProductUpdateCommand;
import com.example.springdemoproject.response.CreateProductResponse;
import com.example.springdemoproject.ports.ProductService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<CreateProductResponse> createProduct(@RequestBody ProductCreateCommand productCreateCommand){
        CreateProductResponse createProductResponse = productService.createProduct(productCreateCommand);
        return new ResponseEntity<>(createProductResponse, HttpStatusCode.valueOf(201));
    }
    @GetMapping("/products")
    public ResponseEntity<List<ProductEntity>> getAllProducts(){
        List<ProductEntity> productEntities = productService.getAllProducts();
        return new ResponseEntity<>(productEntities,HttpStatusCode.valueOf(200));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<CreateProductResponse> deleteProduct(@PathVariable UUID id){
        CreateProductResponse createProductResponse = productService.deleteProduct(id);
        return new ResponseEntity<>(createProductResponse, HttpStatusCode.valueOf(200));
    }
    @PutMapping("/update")
    public ResponseEntity<CreateProductResponse> updateProduct(@RequestBody ProductUpdateCommand productUpdateCommand){
        CreateProductResponse createProductResponse = productService.updateProduct(productUpdateCommand);
        return new ResponseEntity<>(createProductResponse,HttpStatusCode.valueOf(200));
    }
}
