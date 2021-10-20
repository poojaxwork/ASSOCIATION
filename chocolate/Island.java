package com.xwork.chocolate;

public class Island {
	private String[] islandName = new String[5];
	private int count = 0;
	private String location = new String();

	public Island() {
		this("Karnataka");
		System.out.println("invoking no-arg constructor");

	}

	public Island(String location) {
		this.location = location;
		System.out.println("invoking parameterized constructor");

	}

	public String getLocation() {
		return this.location;
	}

	public void printIsland(String name) {
		islandName[0] = name;
		System.out.println("Island".concat(name));
		if (count < 5) {
			islandName[count] = name;
			count++;

		}

	}

	public void displayResult() {
		for (int p = 0; p < islandName.length; p++) {

			System.out.println(islandName[p]);
		}

	}

}
