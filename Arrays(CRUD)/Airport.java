package com.xwork.chocolate;

public class Airport {
	private long[] price = new long[5];
	private int count;

	public Airport() {

	}

	public long[] getFare() {
		return this.price;
	}

	public void printDetails(long price) {
		if (count < this.price.length) {
			this.price[count++] = price;
			System.out.println(price);

		} else {

			System.err.println("Size limit is reached");
			// .concat(String.valueOf(price.length)));
//The primitive type long of price does not have a field length
		}

	}

	public void update(long newValue, int index) {
		System.out.println("Update is invoked");
		if (index >= 0 && index < price.length) {
			System.out.println(newValue + "\n" + index);

			this.price[index] = newValue;

			// .concat(String.valueOf(index)));
		} else {

			System.err.println("Invalid index no");
		}
	}

	public void delete(int num) {
		System.out.println("delete is invoked");
		if (num >= 0 && num < price.length) {
			this.price[num] = 0;

		} else {
			System.out.println("Delete operation is failed");

		}

	}

}
