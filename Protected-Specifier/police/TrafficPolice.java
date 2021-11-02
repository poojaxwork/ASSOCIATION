package com.xwork.newyear.police;

public class TrafficPolice extends Police{
	
	public TrafficPolice() {
super();
	System.out.println("Invoked no-arg traffic police constructer");
	System.out.println(super.Designation);
	System.out.println(super.exper);
	System.out.println(super.name);
	System.out.println(super.noOfStars);
	}
  protected void trafficTester()
 {
	 System.out.println("invoked traffic method");
	 
	 
	 
	 
 }
}
