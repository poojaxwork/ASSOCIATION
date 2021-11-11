package com.xwork.diode;

public class Stadium {
private String name;
private String city;
private float areaInMeters;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public float getAreaInMeters() {
	return areaInMeters;
}
public void setAreaInMeters(float areaInMeters) {
	this.areaInMeters = areaInMeters;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
@Override
	public boolean equals(Object obj) {
if(obj==null)
{
	return false;
			}
if(obj instanceof Stadium)
{Stadium ref=(Stadium)obj;

String city=ref.getName();
String name=ref.getCity();
if(this.city.equals(name) && this.name.equals(city))
{
return true;	
}
	}
	return false;
	}
}
