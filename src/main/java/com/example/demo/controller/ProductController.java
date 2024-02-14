package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	 ProductServiceImpl productService;
	@GetMapping(value="/get")
	public List<Product> getProduct() {
		return productService.getProduct() ;
	}
	@GetMapping(value="/get/{pid}")
	public Product getProductById(@PathVariable Integer pid ) {
		return productService.getProductById(pid) ;
	}
	@GetMapping(value="/getbyname/{pname}")
	public Product getProductByName(@PathVariable String pname) {
		return productService.getProductByName(pname);
	}
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product newProduct) {
		return productService.createProduct(newProduct);
	}
	@DeleteMapping("/delete/{pid}")
	public String deleteProduct(@PathVariable Integer pid) {
		return productService.deleteProduct(pid);
	}	
	@PutMapping("/put/{pid}")
	public String updateProductById(@PathVariable Integer pid,@RequestBody Product product) {
		return productService.updateProductById(pid,product);
	}

}
