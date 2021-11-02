package com.xwork.casting.river;

public class Orange extends Fruits {
	public String type;

	public Orange() {
		super();

		System.out.println(super.good);
		System.out.println(super.name);
		System.out.println(this.type);
	}

}
