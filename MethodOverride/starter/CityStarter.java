package com.xwork.starter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.xwork.diode.City;

public class CityStarter {

	public static void main(String[] args) {
City city=new City();
System.out.println(city.toString());
System.out.println(city.hashCode());
System.out.println("@@@@@@@@@@@@");
Class clazz=city.getClass();
System.out.println(clazz.getName());
System.out.println(clazz.getSimpleName());
System.out.println(clazz.getTypeName());
System.out.println("@@@@@@@@@@@@");
Method[] method=clazz.getMethods();
System.out.println(method.length);
for(int moon=0;moon<method.length;moon++)
{
	System.out.println(method[moon]);
	Method mars=method[moon];
	System.out.println(mars.getModifiers());
	System.out.println(mars.getParameterCount());
	System.out.println(mars.getReturnType());
}
System.out.println("@@@@@@@@@@@@");
Field[] feild=clazz.getFields();
System.out.println(feild.length);
for(int dream=0;dream<feild.length;dream++)
{
	System.out.println(feild[dream]);
	 Field ref=feild[dream];
	 System.out.println(ref.getModifiers());
	 System.out.println(ref.getName());
	 System.out.println(ref.getType());
}

System.out.println("@@@@@@@@@@@@");
City city1=new City();
city.setCountryName("INDIA");
city1.setCountryName("INDIA");
city.setStateName("Karnataka");
city1.setStateName("Karnatak");
System.out.println(city.equals(city1));
	}

}
