package com.xwork.starter;

import com.xwork.diode.Shoe;

public class ShoeStarter {

	public static void main(String[] args) {
Shoe shoe=new Shoe();
System.out.println(shoe);
System.out.println(shoe.hashCode());
Shoe shoe1=new Shoe();
System.out.println(shoe1);
shoe.setBrand("PUMA");
shoe1.setBrand("PUMA");
shoe.setColor("BLACK");
shoe1.setColor("BLAC");
System.out.println(shoe.equals(shoe1));


	}

}
