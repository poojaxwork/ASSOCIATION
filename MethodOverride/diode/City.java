package com.xwork.diode;

public class City {

	private String name;
	private String stateName;
	private String countryName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
		if(obj instanceof City)
		{
			City goodmrg=(City)obj;
			String country=goodmrg.getCountryName();
		String ref=	goodmrg.getStateName();
		if(this.countryName.equals(country) && this.stateName .equals(ref))
		{
			
			return true;
		}
			
		else
		{
			
			return false;
			
		}
		}
		
		
		
		
		
		
		
		return false;
	}
}
