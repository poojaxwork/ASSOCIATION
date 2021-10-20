package com.xwork.chocolate;

public class WaterFall {
	private String location=new String();
	private String[] waterFalls=new String[5];
	private int count=0;
	
public 	WaterFall(){
	this("India");
		
	}
public 	WaterFall(String location){
	this.location=location;
	System.out.println(location);
}

public String getLocation() {
	
	return this.location=location;
}

public void printFalls(String fallsName)
{
	waterFalls[0]=fallsName;
	System.out.println("Water Falls:" .concat(fallsName));
	if(count<5)
	{
		waterFalls[count]=fallsName;
		count++;
		
	}
}
public void displayFalls()
{
for(int p=0;p<waterFalls.length;p++)
{
	System.out.println(waterFalls[p]);}

}





}
