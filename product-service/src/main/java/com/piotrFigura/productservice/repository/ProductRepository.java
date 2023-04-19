package com.piotrFigura.productservice.repository;

import com.piotrFigura.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
