package com.xwork.chocolate.starter;

public class SResort {
private String[] resortNames=new String[5];
private int count=0;
private String location=new String();

 public SResort()
{
	 this("Banglore");
System.out.println("NO-ARG constructor is invoked");	
}
 public SResort(String location)
 {
	 this.location=location;
	 System.out.println(location);
	 
 }
 
public  String getLocation()
 {
	 
	 return this.location;
 }

public void namesOfResort(String resort)
{
	resortNames[0]=resort;
	System.out.println("Resort Name:" .concat(resort));
	if(count<5)
	{
		resortNames[count]=resort;
		count++;
		
	}
	else
	{
		
		System.err.println("Array size limit is reached");
	}}
 
public void displayResort()
{
	for(int p=0;p<resortNames.length;p++)
	{
		System.out.println(resortNames[p]);
		
	}
}
}