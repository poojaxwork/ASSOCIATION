package com.xwork.starter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.xwork.diode.Aeroplane;

public class AeroRunner {

	public static void main(String[] args) {
Aeroplane aero=new Aeroplane();
System.out.println(aero.toString());
System.out.println(aero.hashCode());
Aeroplane aero1=new Aeroplane();
Class ref=aero.getClass();
System.out.println(ref.getModifiers());
System.out.println(ref.getName());
System.out.println(ref.getSimpleName());
System.out.println(ref.getTypeName());
System.out.println("~~~~~~~~~~");
Field[] feild=ref.getFields();
System.err.println("".concat(String.valueOf(feild.length)));
for(int i=0;i<feild.length;i++)
{
	System.out.println(feild[i]);
	Field refer=feild[i];
	System.out.println(refer.getModifiers());
	System.out.println(refer.getName());
	System.out.println(refer.getType());
	
}
System.out.println("~~~~~~~~~");
Method[] methods=ref.getMethods();
System.err.println(methods.length);
for(int i=0;i<methods.length;i++)
{

System.out.println(methods[i]);	
  Method refer=methods[i];
  System.out.println(refer.getModifiers());
  System.out.println(refer.getParameterCount());
  System.out.println(refer.getReturnType());
  System.out.println(refer.getDefaultValue());
  
}
aero.setCompany("Indigo");
aero1.setCompany("Indigo");
aero.setGovt("INDIA");
aero1.setGovt("INDIA");
boolean test=aero.equals(aero1);
System.out.println(test);

System.out.println("~~~~~~~~~");
Constructor[] constref=ref.getConstructors();
System.err.println(constref.length);
for(int i=0;i<constref.length;i++)
{
	System.out.println(constref[i]);
	Constructor refer=constref[i];
	System.out.println(refer.getName());
	System.out.println(refer.getModifiers());
	System.out.println(refer.getParameterCount());
	System.out.println();
	System.out.println();
}




	}

}
