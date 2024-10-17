package com.nicodav28.microservices.product.repository;

import com.nicodav28.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
