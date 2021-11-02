package com.xwork.Krishna;

import com.xwork.casting.river.River;

public class KrishnaRiver extends River {
	
	public String tributories="Godavari";
	public KrishnaRiver() {
		super();
		System.out.println("Invoked no-arg Krishna");
		System.out.println(this.tributories);
		System.out.println(super.length);
		System.out.println(super.destination);
		System.out.println(super.name);
		System.out.println(super.origin);
		
	}

}
