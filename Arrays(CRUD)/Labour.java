package com.xwork.chocolate;

//coffee,airport,stadium
public class Labour {
	private String[] labourNames = new String[5];
	private int coin;

	public Labour() {
		System.out.println("Defalut const is invoked");
	}

	public String[] getName() {

		return this.labourNames;
	}

	public void printNames(String name) {
		if (coin < labourNames.length) {
			String names = this.labourNames[coin++] = name;
			// String names=labourNames[coin++]=name;
			System.out.println("Labour names:".concat(String.valueOf(coin)));
			System.out.println(names);

			System.out.println(names);
		} else {

			System.out.println("Max limit is reached".concat(String.valueOf(labourNames.length)));

		}

	}

	public void update(String newName, int index) {
		if (index >= 0 && index < labourNames.length) {

			this.labourNames[index] = newName;

		}
	}

	public void delete(int no) {
		System.err.println("delete is invoked");
		if (no >= 0 && no < labourNames.length) {

			this.labourNames[no] = null;

		} else {

			System.out.println("index is invalid:".concat(String.valueOf(labourNames.length)));
		}

	}
}

class Coffee {
	private String[] coffeeType = new String[5];
	private int coff;

	public Coffee() {
		System.out.println("Const is invoked");
	}

	public String[] getNames() {
		return this.coffeeType;
	}

	public void printNames(String name) {
		if (coff < coffeeType.length) {
			this.coffeeType[coff++] = name;
			System.out.println("Coffee Name:".concat(String.valueOf(coff)));
			System.out.println(name);
		} else {
			System.out.println("Array limit is reached".concat(String.valueOf(coffeeType.length)));

		}
	}

	public void newName(String updatedname, int indexno) {
		if (indexno >= 0 && indexno < coffeeType.length) {

			System.out.println("update method is invoked");
			this.coffeeType[indexno] = updatedname;

		} else {

			System.err.println("update is not possible".concat(String.valueOf(coffeeType.length)));

		}

	}

	public void deleteIndex(int empty) {
		System.out.println("Delete is invoked");
		if (empty >= 0 && empty < coffeeType.length) {
			 this.coffeeType[empty] = null;
			// System.out.println(ref);
		} else {

			System.err.println("Invalid input".concat(String.valueOf(coffeeType.length)));
		}

	}
}
