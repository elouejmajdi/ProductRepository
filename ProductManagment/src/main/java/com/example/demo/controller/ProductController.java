package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;

	public ProductController(ProductRepository repository) {
		super();
		this.repository = repository;
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	private List<Product> getALL() {
		return repository.findAll();
	}

}
