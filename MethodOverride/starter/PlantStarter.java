package com.xwork.starter;

import com.xwork.diode.Plant;

public class PlantStarter {

	public static void main(String[] args) {
		
		Plant plant=new Plant();
		System.out.println(plant);
		System.out.println(plant.hashCode());
		Plant plant1=new Plant();
		System.out.println(plant1);
		plant.setName("Tomato");		
plant1.setName("Rose");
System.out.println(plant.equals(plant1));
	}
	
	

}
