package com.example.belajarrestfulAPI.controllers;

import com.example.belajarrestfulAPI.entities.Product;
import com.example.belajarrestfulAPI.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("view")
    public Iterable<Product> viewProduct(){
        return productService.findAll();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable("id") Long id){
        return productService.findById(id);
    }
}
