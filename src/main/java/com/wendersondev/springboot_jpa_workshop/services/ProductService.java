package com.wendersondev.springboot_jpa_workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendersondev.springboot_jpa_workshop.entities.Product;
import com.wendersondev.springboot_jpa_workshop.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).get();
    }

}