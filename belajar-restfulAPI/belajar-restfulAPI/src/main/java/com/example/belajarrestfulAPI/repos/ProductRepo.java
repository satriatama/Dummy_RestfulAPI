package com.example.belajarrestfulAPI.repos;

import com.example.belajarrestfulAPI.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
