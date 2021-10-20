package com.xwork.chocolate;

public class Rocket {
private String[] rocket=new String[5];
private int count=0;
private String name=new String();
public Rocket()
{this("Isat");
	System.out.println("NO-arg const is invoked");
	
}
public Rocket(String name)
{
	this.name=name;
	System.out.println(name);
}
public String getName() {
	
	return this.name;
}
public void printNames(String rockName)
{
	
	rocket[0]=rockName;
	System.out.println("Rocket Name:" .concat(rockName));
	if(count<5) 
	{
		rocket[count]=rockName;
		count++;
		
	}}

public void displayName()
{
for(int i=0;i<rocket.length;i++)
{
	
System.out.println(rocket[i]);
}

}


}

















