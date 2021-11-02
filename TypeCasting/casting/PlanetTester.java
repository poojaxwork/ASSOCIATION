package com.xwork.casting;

import com.xwork.Krishna.Mars;
import com.xwork.casting.river.Earth;
import com.xwork.casting.river.Planets;

public class PlanetTester {

	public static void main(String[] args) {
		
		Planets earthref=new Earth();
		Earth earth=(Earth)earthref;
		Planets marsref=new Mars();
		if(earthref instanceof Mars) {
		Mars mars=(Mars)earthref;//classcastexecption
		
		Planets[] array=new Planets[3];
		array[0]=marsref;
		array[1]=earthref;
		for(int comet=0;comet<array.length;comet++)
		{
			System.out.println(array[comet]);
			
		}

	}

}}
