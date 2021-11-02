package com.xwork.casting.river;

public class KaveriRiver extends River {

	private boolean polluted=true;

	KaveriRiver() {
		super();
		System.out.println("Invoked  no-arg Kaveri constructor");
		System.out.println(super.name);
		System.out.println(super.Destination);
		System.out.println(super.length);
		System.out.println(super.origin);
		System.out.println(this.polluted);
		
	}
		
	
	

}
