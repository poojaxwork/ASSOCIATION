package com.xwork.diode;

public class SpeakerClass {
	
	public String name;
	
	public float price;
	public SpeakerClass() {

	System.out.println("invoked no-arg const");
	
	
	}
public void display()
{
	System.out.println("invoked method display");

}

public void displayDetails()
{
	System.out.println("invoked method display");

}

@Override
protected void finalize() throws Throwable {
	super.finalize();
}

}
