package com.xwork.Krishna;

import com.xwork.casting.river.Planets;

public class Mars extends Planets {
	
	public boolean sustain;
	public Mars() {
		super();
System.out.println("no-arg const is invoked");
System.out.println(this.sustain);
System.out.println(super.name);
System.out.println(super.noOfSatiltes);
System.out.println(super.asteroid);

display();


	}

	public void display()
	{
		System.out.println("method is invoked");
		
	}
	
	
}
