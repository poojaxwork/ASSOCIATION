package com.xwork.diode;

public class Belt {
private float price;
private String material;
private float size;
private String gender;
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public float getSize() {
	return size;
}
public void setSize(float size) {
	this.size = size;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
	public String toString() {
	
	System.out.println("overrided toString method");
		return "belt";
	}

@Override
	public int hashCode() {
		return 999;
	}
@Override
	public boolean equals(Object obj) {
	
	if(obj==null)
	{
		System.out.println("input is null");
		return false;
		
	}
	
	if(obj instanceof Belt)
	{
	Belt ref=(Belt)obj;	
	String comp=ref.getMaterial();
	float cost=ref.getPrice();
	Float costref=Float.valueOf(cost);
	Float refer=Float.valueOf(price);
	
	if(this.material.equals(comp) && refer.equals(costref))
	{
		System.out.println("Entered input is matched");
		return true;
		
	}
	else
	{
		System.err.println("Type is mismatched");
		return false;
	}
		
	}
		return false;
	}
}
