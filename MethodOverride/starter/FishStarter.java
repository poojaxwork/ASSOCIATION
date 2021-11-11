package com.xwork.starter;

import com.xwork.constant.FishType;
import com.xwork.diode.Fish;

public class FishStarter {

	public static void main(String[] args) {
Fish fish=new Fish();
System.out.println(fish.toString());
System.out.println(fish.hashCode());
Fish fish1=new Fish();

fish.setColor("Black");
fish1.setColor("Black");
fish.setType(FishType.SHARK);
fish1.setType(FishType.DOLPHIN);
boolean result=fish.equals(fish1);
System.out.println(result);

	}

}
