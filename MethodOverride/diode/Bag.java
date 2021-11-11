package com.xwork.diode;

import com.xwork.constant.BagType;
import com.xwork.constant.Bagcolor;

public class Bag {
	private BagType type;
	private Bagcolor color;
	private int sections;
	public Bagcolor getColor() {
		return color;
	}
	public void setColor(Bagcolor color) {
		this.color = color;
	}
	public BagType getType() {
		return type;
	}
	public void setType(BagType type) {
		this.type = type;
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
	
	if(obj==null)
	{System.out.println("entered value is null");
	return false;
	}
		if(obj instanceof Bag)
		{
			Bag casted=(Bag)obj;
			Bagcolor ref=casted.getColor();
			BagType price=casted.getType();
			
			if(this.color.equals(ref) && this.type.equals(price))
			{
				System.out.println("Bag color is matched");
				return true;
			}
			else
			{
				System.err.println("Color is not matched");
				return false;
			}
				
			
		}
		
	
	return false;
}

}
