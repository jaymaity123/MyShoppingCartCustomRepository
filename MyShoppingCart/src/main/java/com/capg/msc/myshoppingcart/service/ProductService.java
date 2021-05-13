package com.capg.msc.myshoppingcart.service;

import java.util.List;

import com.capg.msc.myshoppingcart.bean.Product;

public interface ProductService {

	
	public List<Product> getAllProducts();
	
	public Product saveProduct(Product p);
	
	public List<Product> getAllProductsByCategory(String category);
	
	public List<Product> getAllProductsByCategoryAndPrice(String category,int range1,int range2);

	public void delete(int productId);

	
	
	

}