package com.xwork.starter;

import java.lang.reflect.Method;

import com.xwork.diode.SpeakerClass;

public class SpeakerStarter {

	public static void main(String[] args) {

SpeakerClass speaker=new SpeakerClass();
speaker.display();

Class clazz=speaker.getClass();
speaker=null;
System.out.println(clazz.getModifiers());
System.out.println(clazz.getName());
System.out.println(clazz.getSimpleName());
System.out.println(clazz.getTypeName());
System.out.println(clazz.getClass());
System.err.println("no.of fields".concat(String.valueOf(clazz.getFields())));

  Method[] methods=clazz.getMethods();
System.out.println("TOTAL no of methods are:".concat(String.valueOf(methods.length)));
for(int i=0;i<methods.length;i++)
{
	System.out.println(methods[i]);
	Method ref=methods[i];
	System.out.println(ref.getDefaultValue());
	System.out.println(ref.getParameterCount());
	System.out.println(ref.getName());
	System.out.println(ref.getReturnType());
	System.out.println(ref.getParameters());
	System.out.println(ref.getParameterTypes());
//System.out.println(ref.get);
	
}

	}

}
