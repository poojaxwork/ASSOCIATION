package com.xwork.diode;

import com.xwork.constant.ShoeSize;

public class Shoe {
	
	private String brand;
	private ShoeSize size;
	private String color;
	private String gender;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ShoeSize getSize() {
		return size;
	}
	public void setSize(ShoeSize size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
@Override
public String toString() {
	return "override";
}
@Override
public int hashCode() {
	return 100;
}
@Override
public boolean equals(Object obj) {
	if(obj==null)
	{
	System.out.println("Value is null");
	return false;
		
	}
	if(obj instanceof Shoe)
	{
		Shoe ref=(Shoe)obj;
		ref.getBrand();
		if(ref.equals(this.brand))
		{
			System.out.println("Matched");
			return true;
		}
		else
		{
			
			System.out.println("Mismatch");
		}
	}
	
	
	return false;
}
}
