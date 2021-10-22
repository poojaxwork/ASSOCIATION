package com.xwork.chocolate.starter;

import com.xwork.chocolate.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
		Stadium refer=new Stadium();
		refer.printValues(500);
		refer.printValues(1000);
		refer.printValues(1500);
		refer.printValues(5400);
		refer.printValues(900);
		refer.printValues(5003);
		refer.update(1000,0);
		refer.deleteIndex(4);
		int[] index=refer.getValue();
		for(int i=0;i<index.length;i++)
		{
			System.out.println(index[i]);
		}
	}

}
