package com.xwork.chocolate.starter;

import com.xwork.chocolate.CoolDrink;

public class CoolDrinkStarter {
	public static void main(String[] args) {
		CoolDrink refer = new CoolDrink();

		refer.printBrand("7 UP");
		refer.printBrand("Slice");
		refer.printBrand("Mazza");
		refer.printBrand("Sting");
		refer.printBrand("Thumsup");
		 refer.printBrand("Sprit");
		
		refer.getName();
		refer.delete(2);
		refer.update(1, "Mountain Dew");
		{
			String[] ref = refer.getName();

			for (int i = 0; i < ref.length; i++) {
				if (i < ref.length)
					System.out.println(ref[i]);

			}

		}

	}

}