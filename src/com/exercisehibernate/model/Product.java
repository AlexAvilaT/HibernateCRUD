package com.exercisehibernate.model;

public class Product 
{
	private int idProduct;
	private String NameProduct;
	private double PriceProduct;
	
	public Product(int idProduct, String nameProduct, double priceProduct)
	{
		super();
		this.idProduct = idProduct;
		this.NameProduct = nameProduct;
		this.PriceProduct = priceProduct;
	}

	public Product()
	{
		super();
	}

	public int getIdProduct()
	{
		return idProduct;
	}

	public void setIdProduct(int idProduct)
	{
		this.idProduct = idProduct;
	}

	public String getNameProduct() 
	{
		return NameProduct;
	}

	public void setNameProduct(String nameProduct) 
	{
		this.NameProduct = nameProduct;
	}

	public double getPriceProduct()
	{
		return PriceProduct;
	}

	public void setPriceProduct(double priceProduct) 
	{
		this.PriceProduct = priceProduct;
	}

	@Override
	public String toString() {
		return "Product [Idproduct=" + idProduct + ", NameProduct=" + NameProduct + ", PriceProduct=" + PriceProduct
				+ "]";
	}
	
	
	
	
	
	
}
