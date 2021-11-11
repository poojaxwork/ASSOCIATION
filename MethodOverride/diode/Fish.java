package com.xwork.diode;

import com.xwork.constant.FishType;

public class Fish {
private String name;
private FishType type;
private float price;
private String color;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public FishType getType() {
	return type;
}
public void setType(FishType type) {
	this.type = type;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

@Override
	public String toString() {
		return "fish";
	}

@Override
	public int hashCode() {
		return 88;
	}

@Override
	public boolean equals(Object obj) {
	
	if(obj==null)
	{
		System.out.println("input is null");
		return false;
	}
	
	if(obj instanceof Fish)
	{
		Fish fish=(Fish)obj;
		String col=fish.getColor();
		FishType type=fish.getType();
		if(this.color.equals(col) && this.type.equals(type))
		{
			System.out.println("type is matched");
			return true;
		}
		else
		{
			System.err.println("type is mis-matched");
			
			
		}
		
	}
		return false;
	}
}
