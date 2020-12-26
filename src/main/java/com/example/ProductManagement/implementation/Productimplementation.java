package com.example.ProductManagement.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ProductManagement.model.Products;
import com.example.ProductManagement.repository.ProductRepository;

@Component
public class Productimplementation {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> getProducts(){
		return productRepository.findAll();
	}
	
	public void saveProducts(Products products ) {
		productRepository.save(products);
	}
	
	public void deleteProductById(Integer id) {
		productRepository.deleteById(id);
	}
	
	public Products getProduct(Integer id) {
		return productRepository.findById(id).get();
	}
}
