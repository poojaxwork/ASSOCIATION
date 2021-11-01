package com.xwork.dp.dto;

public class TempleDTO {
	private String name;
	private String location;
	private String mainGod;
	private boolean prasada;
	private int noOfpillars;
	
	public TempleDTO() {
		System.out.println("Temple is invoked");
}

	public TempleDTO(String name, String location, String mainGod, boolean prasada, int noOfpillars) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.prasada = prasada;
		this.noOfpillars = noOfpillars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public boolean isPrasada() {
		return prasada;
	}

	public void setPrasada(boolean prasada) {
		this.prasada = prasada;
	}

	public int getNoOfpillars() {
		return noOfpillars;
	}

	public void setNoOfpillars(byte noOfpillars) {
		this.noOfpillars = noOfpillars;
	}
	
	
	
	
	
}
