package com.capg.msc.myshoppingcart.dao;

import java.util.List;

import com.capg.msc.myshoppingcart.bean.Product;

public interface CustomProductRepository {

	public List<Product> getProductByCategory(String proudctCategory);
	public List<Product> getProductByCategoryAndPrice(String proudctCategory,int range1,int range2);
	
}