package com.xwork.chocolate;

public class Gin {
	private String brand = new String();
	private String[] ginNames = new String[5];
	private int count = 0;

	public Gin() {

		this("SipSmith London");
		System.out.println("NO-ARG constructor is invoked");
	}

	public Gin(String brand) {
		this.brand = brand;
		System.out.println(brand);
	}

	String getBrand() {
		return this.brand;
	}

	public void printNames(String name) {
		ginNames[0] = name;
		System.out.println("Gin name:".concat(name));
		if (count < 5) {
			ginNames[count] = name;
			count++;

		} else {
			System.out.println("Array size limit is reached");

		}
	}

	public void displayName() {
		for (int o = 0; o < ginNames.length; o++) {

			System.out.println(ginNames[o]);
		}

	}

}
