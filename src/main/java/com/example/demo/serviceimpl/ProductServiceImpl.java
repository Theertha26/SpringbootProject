package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
	ProductRepository productRepository; 
	public List<Product> getProduct() {
		return productRepository.findAll();
	}
	public Product getProductById(Integer pid) {
		Optional<Product> prod = productRepository.findById(pid);
	    return prod.orElse(null);
	}
	public Product getProductByName(String pname) {
		Product product = productRepository.findByName(pname);
		return product;
	}
	public Product createProduct(Product newProduct) {
		return productRepository.save(newProduct);
	}
	public String deleteProduct(Integer pid) {
		productRepository.deleteById(pid);
		return "Deleted Successfully";
	}
	public String updateProductById(Integer pid, Product updatingproduct) {
		Optional<Product> existingProduct = productRepository.findById(pid);
		if(existingProduct.isPresent()) {
			Product pro = existingProduct.get();
			pro.setPname(updatingproduct.getPname());
			pro.setPdetails(updatingproduct.getPdetails());
			pro.setPtxnno(updatingproduct.getPtxnno());
			productRepository.save(pro);
			return "update successfully";
		}
		else
		{
			return "Record not found";
		}
		
	}

}
