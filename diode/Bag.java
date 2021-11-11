package com.xwork.diode;

import com.xwork.constant.Bagcolor;

public class Bag {
	private float type;
	private Bagcolor color;
	private int sections;
	public float getType() {
		return type;
	}
	public void setType(float type) {
		this.type = type;
	}
	public Bagcolor getColor() {
		return color;
	}
	public void setColor(Bagcolor color) {
		this.color = color;
	}
	public int getSections() {
		return sections;
	}
	public void setSections(int sections) {
		this.sections = sections;
	}
	@Override
	public String toString() {
		return "to-string is overrided";
	}
@Override
public int hashCode() {

	return 1000;
}

@Override
public boolean equals(Object obj) {

	System.out.println("equals method is invoked");
	if(obj==null)
	{
		System.out.println("enterd value is null,check it once");
		return false;
	}
	if(obj instanceof Bag)
	{
		Bag ref=(Bag)obj;
		Bagcolor refer=ref.getColor();
		int bagsec=ref.getSections();
		Integer bagrefer=Integer.valueOf(bagsec);
		Integer ref1=Integer.valueOf(this.sections);
		
		if(this.color.equals(refer) && bagrefer.equals(ref1));
		{
			System.out.println("Value is macthed");
			return true;
		}}
		else
		{
			System.err.println("mismatch");
			//return false;
		}
		

	
	
	return false;
}
}
