package com.hwrky.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hwrky.shop.dao.ProductMapper;
import com.hwrky.shop.entity.Product;
import com.hwrky.shop.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	private ProductMapper productMapper;
	@Resource(name="productMapper")
	
	 public void setProductMapper(ProductMapper productMapper){
        this.productMapper = productMapper;
    }
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	@Override
	public boolean add(Product product) {
		return productMapper.insertOne(product)>0;
	}
	@Override
	public List<Product> selectAll() {
		
		return productMapper.selectAll();
	}
	
}
