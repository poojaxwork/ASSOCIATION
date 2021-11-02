package com.xwork.newyear.crime;

import com.xwork.newyear.police.Police;

public class CrimePolice extends Police{
	
	public CrimePolice() {
		super();
System.out.println("invoked no-arg CrimePolice const");
System.out.println(super.Designation);
System.out.println(super.exper);
		System.out.println(super.name);
				System.out.println(super.noOfStars);
	}
	
	 public  void tester()
	{
		
		System.out.println("invoked tester from crime police"); 
		super.displayDetails();
	}

}
