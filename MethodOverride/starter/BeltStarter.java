package com.xwork.starter;

import com.xwork.diode.Belt;

public class BeltStarter {

	public static void main(String[] args) {
Belt ref=new Belt();
System.out.println(ref);
System.out.println(ref.hashCode());
Belt ref1=new Belt();
System.out.println(ref1);

ref.setMaterial("Leather");
ref1.setMaterial("Leather");
ref.setPrice(999.9f);
ref1.setPrice(99.9f);
boolean result=ref.equals(ref1);
System.out.println(result);
	}

}
