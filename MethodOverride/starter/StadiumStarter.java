package com.xwork.starter;

import com.xwork.diode.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
Stadium ref=new Stadium();
System.out.println(ref.toString());
System.out.println(ref.hashCode());
Stadium ref1=new Stadium();
ref.setCity("Tumkur");
ref1.setCity("Tumkur");
ref.setName("S.I.T");
ref1.setName("S.I.T");
System.out.println(ref.equals(ref1));
	}

}
