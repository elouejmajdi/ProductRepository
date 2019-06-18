package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue
	private long idProduct;

	private String nameOfProduct;

	private String codeProduct;

	public Product(String nameOfProduct, String codeProduct) {
		super();
		this.nameOfProduct = nameOfProduct;
		this.codeProduct = codeProduct;
	}

	public Product() {
		super();
	}

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameOfProduct() {
		return nameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public String getCodeProduct() {
		return codeProduct;
	}

	public void setCodeProduct(String codeProduct) {
		this.codeProduct = codeProduct;
	}

}
