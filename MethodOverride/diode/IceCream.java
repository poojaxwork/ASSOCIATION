package com.xwork.diode;

import com.xwork.constant.Flavour;
import com.xwork.constant.IceType;

public class IceCream {
	private String name;
	private Flavour flavour;
	private IceType type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Flavour getFlavour() {
		return flavour;
	}
	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}
	public IceType getType() {
		return type;
	}
	public void setType(IceType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "tostring";
	}

	
	@Override
	public int hashCode() {
		return 299;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
		{
			System.out.println("value is null");
			return false;
			
		}
		if(obj instanceof IceCream) {
			IceCream ref=(IceCream)obj;
			
			Flavour ice=ref.getFlavour();
			String icename=ref.getName();
			if(this.flavour.equals(ice) && this.name.equals(icename))
			{
				System.out.println("matched");
				return true;
				
			}
			else
			{
				System.err.println("mismatch");
			}
		}
		
		return false;
	}
}
