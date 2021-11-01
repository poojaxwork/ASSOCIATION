package com.xwork.dp.dto;

public class FacebookApplicationDTO extends ApplicationDTO {
	
	private String ceoName;
	private  String headQuarter;
	public FacebookApplicationDTO() {
		System.out.println("invoked facebook no-arg constructor");
	}
	public FacebookApplicationDTO(String ceoName, String headQuarter) {
		super("Watsapp", "2.19.134", "Watsapp.Inc", "Jan Koum");
		this.ceoName = ceoName;
		this.headQuarter = headQuarter;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getHeadQuarter() {
		return headQuarter;
	}
	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}
	
}
