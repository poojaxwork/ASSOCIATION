package com.xwork.newyear.police;

import com.xwork.newyear.Constant.PoliceDept;

public class Police {
	public String name;
	 protected PoliceDept dept;
	 protected int noOfStars;
	 protected float exper;
	 protected String Designation;
	
	protected Police() {
		super();
System.out.println("invoked police no-arg constructor");	
}
	
	 protected void displayDetails()
	{
		System.out.println("invoked dispaly method from Police");
		
	}
	
	


	
}
