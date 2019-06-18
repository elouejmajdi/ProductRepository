package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class ProductManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagmentApplication.class, args);
	}
	
	@Bean 
	CommandLineRunner init(ProductRepository
			repositoy) {
		return args -> {
		repositoy.save(new Product("Laptop","2133FAE2"));
		repositoy.save(new Product("Chair","2ADGW3"));
		repositoy.save(new Product("Phone","2984GADLO"));
		repositoy.save(new Product("FIFA Game","8935FKE"));
			
			
			
		}; 
		
	}
	
	

}
