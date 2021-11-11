package com.xwork.starter;

import com.xwork.constant.Flavour;
import com.xwork.diode.IceCream;

public class IceCreamStarter {

	public static void main(String[] args) {
IceCream cream=new IceCream();
System.out.println(cream);
System.out.println(cream.hashCode());
IceCream cream1=new IceCream();
System.out.println(cream1);
cream.setFlavour(Flavour.CHOCO);
cream1.setFlavour(Flavour.CHOCO);
cream.setName("Chocobar");
cream1.setName("Choco");
System.out.println(cream.equals("butter scotch"));
	}

}
