package com.sts.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private float  prodPrize;
	private String  prodcategory;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getProdPrize() {
		return prodPrize;
	}
	public void setProdPrize(float prodPrize) {
		this.prodPrize = prodPrize;
	}
	public String getProdcategory() {
		return prodcategory;
	}
	public void setProdcategory(String prodcategory) {
		this.prodcategory = prodcategory;
	}
	public Product(int prodId, String prodName, float prodPrize, String prodcategory) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrize = prodPrize;
		this.prodcategory = prodcategory;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrize=" + prodPrize + ", prodcategory="
				+ prodcategory + "]";
	}
	
}
