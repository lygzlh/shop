package com.hwrky.shop.entity;

import java.util.Date;

public class Product {
	private Integer id;
    private String product_type;
    private String state;
    private String product_name;
    private String product_title;
    private Double product_price;
    private Double product_sales;
    private String product_id;
    private Date product_date;
    private String product_url;
    
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product_type='" + product_type + '\'' +
                ", state='" + state + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_title='" + product_title + '\'' +
                ", product_price=" + product_price +
                ", product_sales=" + product_sales +
                ", product_id=" + product_id +
                ", product_date=" + product_date +
                ", product_url='" + product_url  +
                "'}";
    }
	public String getProduct_url() {
		return product_url;
	}
	public Product setProduct_url(String product_url) {
		this.product_url = product_url;
		return this;
	}
	public Integer getId() {
		return id;
	}
	public Product setId(Integer id) {
		this.id = id;
		return this;
	}
	public String getProduct_type() {
		return product_type;
	}
	public Product setProduct_type(String product_type) {
		this.product_type = product_type;
		return this;
	}
	public String getState() {
		return state;
	}
	public Product setState(String state) {
		this.state = state;
		return this;
	}
	public String getProduct_name() {
		return product_name;
	}
	public Product setProduct_name(String product_name) {
		this.product_name = product_name;
		return this;
	}
	public String getProduct_title() {
		return product_title;
	}
	public Product setProduct_title(String product_title) {
		this.product_title = product_title;
		return this;
	}
	public Double getProduct_price() {
		return product_price;
	}
	public Product setProduct_price(Double product_price) {
		this.product_price = product_price;
		return this;
	}
	public Double getProduct_sales() {
		return product_sales;
	}
	public Product setProduct_sales(Double product_sales) {
		this.product_sales = product_sales;
		return this;
		
	}
	public String getProduct_id() {
		return product_id;
	}
	public Product setProduct_id(String product_id) {
		this.product_id = product_id;
		return this;
	}
	public Date getProduct_date() {
		return product_date;
	}
	public Product setProduct_date(Date product_date) {
		this.product_date = product_date;
		return this;
	}

}
