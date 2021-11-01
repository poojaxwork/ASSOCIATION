package com.xwork.dp.dto;

public class CameraDTO {
	private String company;
	private String type;
	private String pixel;
	private Float price;
	private  float batteryCapacity;
	private Float weight;
	public CameraDTO() {
	
	System.out.println("invoked camera no-arg coonstructor");
	}
	public CameraDTO(String company, String type, String pixel, Float price, float batteryCapacity, Float weight) {
		super();
		this.company = company;
		this.type = type;
		this.pixel = pixel;
		this.price = price;
		this.batteryCapacity = batteryCapacity;
		this.weight = weight;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPixel() {
		return pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public float getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(float batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	

}
