package com.example.demo.modal;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductService {

    private final ProductMap productMapper;

    public void addProduct(ProductRequest product) {
//        System.out.println(product);
        productMapper.insert(product);
    }

    public Products getProductById(int id) {
        return productMapper.selectById(id);
    }

    public List<Products> getAllProducts() {
        return productMapper.selectAll();
    }

    public void updateProduct(Products product) {
        productMapper.update(product);
    }

    public void deleteProduct(int id) {
        productMapper.delete(id);
    }
}
