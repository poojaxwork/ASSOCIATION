package com.xwork.chocolate;
import com.xwork.chocolate.starter.SResort;
public class ResortStarter {

	public static void main(String[] args) {
		SResort resort=new SResort();
			resort.getLocation();
			resort.namesOfResort("EagleTon resort");
			resort.namesOfResort("Honeydew resort");
			resort.namesOfResort("Magical resort");
			resort.namesOfResort("Happy Stay resort");
			resort.namesOfResort("CountrySide Inn");
			resort.namesOfResort("Happy Times");
			resort.displayResort();
	}

}
