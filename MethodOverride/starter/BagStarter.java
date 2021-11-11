package com.xwork.starter;

import com.xwork.constant.BagType;
import com.xwork.constant.Bagcolor;
import com.xwork.diode.Bag;

public class BagStarter {

	public static void main(String[] args) {

		Bag bagref=new Bag();
		System.out.println(bagref);
		System.out.println(bagref.hashCode());
		System.out.println(bagref.toString());
		System.out.println(bagref.hashCode());
		Bag bagref1=new Bag();
		System.out.println(bagref1.toString());
		System.out.println(bagref1.hashCode());
		bagref.setColor(Bagcolor.BLACK);
		bagref1.setColor(Bagcolor.BLACK);
		bagref.setType(BagType.COLLEGE);
		bagref1.setType(BagType.COLLEGE);
		boolean result=bagref.equals(bagref1);
		System.out.println(result);
	}

}
