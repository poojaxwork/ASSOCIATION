package com.xwork.starter;

import com.xwork.diode.Watch;

public class WatchStarter {

	public static void main(String[] args) {
		Watch watch = new Watch();

		System.out.println(watch.toString());
		System.out.println(watch.hashCode());
		System.out.println(watch.hashCode());
		Watch watch1 = new Watch();
		System.out.println(watch1);
		System.out.println(watch1.hashCode());
		watch.setBrand("Fast-Track");
		watch1.setBrand("Fast-Track");
		watch.setPrice(1000.9f);
		watch1.setPrice(1000.9f);
		
		boolean result = watch.equals(watch1);
		System.out.println(result);
	}

}
