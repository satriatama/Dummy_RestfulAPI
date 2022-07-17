package com.example.belajarrestfulAPI.services;

import com.example.belajarrestfulAPI.entities.Product;
import com.example.belajarrestfulAPI.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public Product create(Product product){
        return productRepo.save(product);
    }
    public Product findById(Long id){
        return productRepo.findById(id).get();
    }
    public void delete(Product product){
        productRepo.delete(product);
    }
    public void deleteById(Long id){
        productRepo.deleteById(id);
    }
    public Product update(Product product, Long id){
        productRepo.deleteById(id);
        return productRepo.save(product);
    }
}
