package com.xwork.dp.dto;

public class BucketDTO {
	private String color;
	private Size size;
	private Float price;//autoboxing converting primitive into corresponding wrapper class
	private Integer quantity;
	private float weight;
	private String company;
	public BucketDTO() {
		System.out.println("Bucket-DTO no arg is invoked");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public BucketDTO(String color, Size size, Float price, Integer quantity, float weight, String company) {
		super();
		this.color = color;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
		this.company = company;
	}

}
