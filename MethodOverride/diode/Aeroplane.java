package com.xwork.diode;

public class Aeroplane {
public String no;
public String company;
public String govt;
public Aeroplane(String no, String company, String govt) {
	super();
	this.no = no;
	this.company = company;
	this.govt = govt;
}
public Aeroplane() {
	super();
}
public Aeroplane(String no, String company) {
	super();
	this.no = no;
	this.company = company;
}
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getGovt() {
	return govt;
}
public void setGovt(String govt) {
	this.govt = govt;
}
@Override
	public String toString() {
		return "Airways";
	}
@Override
	public int hashCode() {
		return 88;
	}

@Override
	public boolean equals(Object obj) {
	if(obj==null)
	{
		System.out.println("input is invalid");
		return false;
		
	}
	if(obj instanceof Aeroplane)
	{
		Aeroplane air=(Aeroplane)obj;
		String comp=air.getCompany();
		String govt=air.getGovt();
		
		
		if(this.company.equals(comp) && this.govt.equals(govt))
		{
			
			System.out.println("Type is matched");
			return true;
		}
		else
		{
			
			System.err.println("type is not found");
		}
	}
		return false;
	}



@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}



