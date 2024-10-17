package com.nicodav28.microservices.product.controller;

import com.nicodav28.microservices.product.dto.ProductRequest;
import com.nicodav28.microservices.product.dto.ProductResponse;
import com.nicodav28.microservices.product.model.Product;
import com.nicodav28.microservices.product.repository.ProductRepository;
import com.nicodav28.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseStatus
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
