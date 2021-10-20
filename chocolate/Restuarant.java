package com.xwork.chocolate;

public class Restuarant {
	private String[] restaurantNames=new String[5];
	private int count=0;
	private String location=new String();
	
	public Restuarant()
	{
		this("Banglore");
		System.out.println("NO-ARG constructor is invoked");
		
	}
	
	public Restuarant(String location)
	{
		System.out.println("parameterized constructor is invoked");
		this.location=location;
		System.out.println(location);
	}
	String getLocation()
	{
		return this.location;
		
	}
	public void namesOfRest(String name)
	{
		restaurantNames[0]=name;
		System.out.println("Name:" .concat(name));
		if(count<5)
		{
			restaurantNames[count]=name;
			count++;
			
		}}
	public void displayName()
	{
		for(int i=0;i<restaurantNames.length;i++)
		{
			
			System.out.println(restaurantNames[i]);
		}
		
	}
		
		
	
		
	
}
