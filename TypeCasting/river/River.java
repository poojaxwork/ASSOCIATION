package com.xwork.casting.river;

public class River {
	public String name="Bhadhra";
	public String origin;
	public String Destination;
	 public long length;
	public River() {

	System.out.println("Invoking  no-arg river constructor");
	
	}
	public River(String name, String origin, String destination, long length) {
		super();
		this.name = name;
		this.origin = origin;
		this.Destination = destination;
		this.length = length;
	}
	
	

}
