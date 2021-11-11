package com.xwork.diode;

import com.xwork.constant.Type;

public class Watch {
private String brand;
private Type type;
private float price;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public Type getType() {
	return type;
}

public void setType(Type type) {
	this.type = type;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}
@Override
	public String toString() {
		
		return "poo";
	}
@Override
	public int hashCode() {
		return 100;
	}
@Override
	public boolean equals(Object obj) {
	
	if(obj==null)
	{
	System.out.println("Entered value is null and check it once");	
		return false;
	}
	if(obj instanceof Watch)
	{
		Watch refer=(Watch)obj;
	String watchref=refer.getBrand();
	float priceref=refer.getPrice();
	Float pri=Float.valueOf(priceref);
	Float prirefer=Float.valueOf(this.price);
	System.out.println("Entered value:".concat(watchref));
	System.out.println("Entered value is of type Watch");	
	
	
	if(watchref.equals(this.brand) && pri.equals(prirefer))
	{
		System.out.println(" matched");
		return true;
		
	}}
	
	
	else
	{
		System.err.println("NO-MATCH");
		
	}
				return false;
	}
}
