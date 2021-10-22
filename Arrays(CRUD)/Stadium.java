package com.xwork.chocolate;

public class Stadium {
	private int[] capacity = new int[5];
	private int count;

	public Stadium() {
		System.out.println("no-arg const is invoked");
	}

	public int[] getValue() {
		return this.capacity;

	}

	public void printValues(int value) {
		if (count < capacity.length) {
			this.capacity[count++] = value;
			System.out.println(value);

		}

		else {
			System.err.println("Array size limit is reched".concat(String.valueOf(capacity.length)));
		}

	}

	public void update(int newno, int num) {
		if (num >= 0 && num < capacity.length) {
			this.capacity[num] = newno;
		} else {
			System.out.println("update is failed".concat(String.valueOf(capacity.length)));

		}
	}

	public void deleteIndex(int cap) {
		if (cap >= 0 && cap < capacity.length) {

			this.capacity[cap] = 0;

		}

		else {
			System.err.println("delete is failed".concat(String.valueOf(capacity.length)));

		}
	}

}
