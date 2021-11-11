package com.xwork.diode;

import com.xwork.constant.TypeHeadset;

public class HeadSet {
	
	private String brand;
	private TypeHeadset type;
	private  boolean battery;
	private int warranty;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public TypeHeadset getType() {
		return type;
	}
	public void setType(TypeHeadset type) {
		this.type = type;
	}
	public boolean isBattery() {
		return battery;
	}
	public void setBattery(boolean battery) {
		this.battery = battery;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	@Override
	public String toString() {
		return "override";
	}
	@Override
	public int hashCode() {
		return 200;
	}
@Override
public boolean equals(Object obj) {

	if(obj==null)
	{
		System.out.println("value is null");
		return false;
	}
	if(obj instanceof HeadSet)
	{
		HeadSet set=(HeadSet)obj;
		String ref=set.getBrand();
		TypeHeadset headref =set.getType();
		if(this.brand.equals(ref) && this.type.equals(headref))
		{
			System.out.println("matched");
			
			return true;
		}
		
	
	
	else
	{
		
		System.err.println("Mismatch");
		return false;
	}}
	
	
	
	
	return false;
}
}
