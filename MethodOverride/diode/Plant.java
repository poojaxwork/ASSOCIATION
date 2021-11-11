package com.xwork.diode;

import com.xwork.constant.PlantType;

public class Plant {
private String name;
private boolean alive;
private int lifespan;
private PlantType type;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isAlive() {
	return alive;
}
public void setAlive(boolean alive) {
	this.alive = alive;
}
public int getLifespan() {
	return lifespan;
}
public void setLifespan(int lifespan) {
	this.lifespan = lifespan;
}
public PlantType getType() {
	return type;
}
public void setType(PlantType type) {
	this.type = type;
}

@Override
	public String toString() {
		return "plant";
	}
@Override
	public int hashCode() {
		return 00;
	}
@Override
	public boolean equals(Object obj) {
	System.out.println("equals override method is invoked");
	if(obj==null)
	{
		System.out.println("null");
		return false;
	}
	if(obj instanceof Plant)
	{
		Plant ref=(Plant)obj;
	String refer=ref.getName();
		if(refer.equals(this.name))
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
