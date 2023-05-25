package com.FoodboxBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodboxBackend.entities.Product;
import com.FoodboxBackend.repo.ProductRepo;




@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	
	public Product addProduct(Product product) 
	{ 
		product.setStatus("added");
		return productRepo.save(product); 
		
     }
	
	public List<Product> getProducts()  {
		
		 List<Product> products=(List<Product>) productRepo.findAll();
		 
		 return products;
		 
	
	}
	
	public Product getProductByIdService(int id)
	{
		return productRepo.findById(id);
	}
	
}
