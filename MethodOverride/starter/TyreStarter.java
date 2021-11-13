package com.xwork.starter;

import com.xwork.diode.Tyre;

public class TyreStarter {

	public static void main(String[] args) {
		Tyre ref = new Tyre();
		System.out.println(ref.toString());
		System.out.println(ref.hashCode());
		Tyre ref1 = new Tyre();
		ref.setBrand("MRF");
		ref1.setBrand("CEAT");
		ref.setPrice(400.6f);
		ref1.setPrice(400.6f);
		System.out.println(ref.equals(ref1));
	}

}
