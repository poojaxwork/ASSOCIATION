package com.xwork.casting;

import com.xwork.Krishna.KrishnaRiver;
import com.xwork.casting.river.KaveriRiver;
import com.xwork.casting.river.River;

public class RiverTester {

	public static void main(String[] args) {
River river=new KrishnaRiver(); 
// type casting
KrishnaRiver krishriver=(KrishnaRiver)river;
Object object=new KaveriRiver();
KaveriRiver kaveri=(KaveriRiver)object;
if(river instanceof KaveriRiver)//to prevent classcastexecption
{
KaveriRiver kaveri1=(KaveriRiver)river;		
}
 if( object  instanceof KrishnaRiver ) { 
KrishnaRiver krishna=(KrishnaRiver)object;
 }
Object obj=new String();
if(obj instanceof KrishnaRiver)
{
KrishnaRiver krishna=(KrishnaRiver)obj;
}
System.err.println("Array elements are looping");
KaveriRiver kref=new KaveriRiver();
Object[] array=new Object[4];
array[0]="Bhadhra";
array[1]=2000;
array[3]=50.f;
//array[4]=kref;
for(int time=0;time<array.length;time++)
{
	River rivercast=new KaveriRiver();
	KaveriRiver ref=(KaveriRiver)rivercast;
	if(rivercast instanceof KaveriRiver)
	{
		System.out.println(array[time]);
		System.out.println(ref.destination);
		
	}
}
}}
