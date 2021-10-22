package com.xwork.chocolate;

public class CoolDrink {

	private String[] brandNames = new String[5];
	private int count;

	public CoolDrink() {
		System.out.println("Constructor is invoked");
		// this.brandNames=name;
	}

	public void printBrand(String name) {
		if (count < this.brandNames.length) {

			String brand = brandNames[count++] = name;
			System.out.println("Brand Name:".concat(String.valueOf(count)));
			System.out.println(brand);
		} else {

			System.err.println("Max limit is reached".concat(String.valueOf(this.brandNames.length)));

		}
	}

	public String[] getName() {
		return this.brandNames;

	}

	public void update(int no, String newName) {
		if (no >= 0 && no < this.brandNames.length) {
			System.out.println("Invoked update");
			this.brandNames[no] = newName;
			System.out.println(newName.concat(String.valueOf(no)));
			// .concat(newName));
		} else {
			System.err.println("cannot update".concat(String.valueOf(brandNames.length)));

		}

	}

	public void delete(int index) {
		if (index >= 0 && index < brandNames.length) {
			System.out.println("delete is invoked");
			this.brandNames[index] = null;
		}

		else {

			System.err.println("delete is not performed".concat(String.valueOf(brandNames.length)));
		}

	}

}
