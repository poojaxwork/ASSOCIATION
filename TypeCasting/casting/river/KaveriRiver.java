package com.xwork.casting.river;

public class KaveriRiver extends River{
	public boolean polluted;
	
	public KaveriRiver() {
		super();
System.out.println("Kavrei river no-arg const is invoked");
	System.out.println(this.polluted);
	System.out.println(super.name);
	System.out.println(super.origin);
	System.out.println(super.length);
	System.out.println(super.origin);
	}

}
