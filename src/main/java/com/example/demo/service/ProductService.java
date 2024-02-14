package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;



public interface ProductService {
	public List<Product> getProduct();
	public Product getProductById(Integer pid);
	   public Product getProductByName(String pname);
	   Product createProduct(Product newProduct);
	   String deleteProduct(Integer pid);
	   String updateProductById(Integer pid,Product updatingproduct);

}
