package com.hwrky.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hwrky.shop.entity.Product;

public interface ProductMapper {
	Integer insertOne(@Param("product") Product product);
	List<Product> selectAll();
}
