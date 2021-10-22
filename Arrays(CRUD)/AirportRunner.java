package com.xwork.chocolate.starter;

import com.xwork.chocolate.Airport;

public class AirportRunner {

	public static void main(String[] args) {
		Airport airport = new Airport();
		airport.printDetails(30000l);
		airport.printDetails(40000l);
		airport.printDetails(50000l);
		airport.printDetails(90000l);
		airport.printDetails(300000l);
		airport.update(200000l, 1);
		airport.delete(0);
		long[] ref = airport.getFare();
		for (int p = 0; p < ref.length; p++) {

			System.out.println(ref[p]);
		}

	}

}
