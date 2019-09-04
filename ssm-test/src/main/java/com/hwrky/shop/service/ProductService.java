package com.hwrky.shop.service;

import java.util.List;

import com.hwrky.shop.entity.Product;


public interface ProductService {
	boolean add(Product product);
	List<Product> selectAll();
}
