package com.xwork.dp.dto;

public class ApplicationDTO {
	public String name;
	public String version;
	public String company;
	public String founder;
	 
public ApplicationDTO() {

System.out.println("ApplicationDTO no-arg const is invoked");
}

public ApplicationDTO(String name, String version, String company, String founder) {
	super();
	this.name = name;
	this.version = version;
	this.company = company;
	this.founder = founder;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getFounder() {
	return founder;
}

public void setFounder(String founder) {
	this.founder = founder;
}


}
