package com.xwork.dp.dto;

public class IplDTO {
private String teamName;
private Integer noOfCoach;
private Integer noOfTeam;
private String owner;
private String sponser;
public IplDTO() {
	System.out.println("IPL DTO no-arg is invoked:");
}
public IplDTO(String teamName, Integer noOfCoach, Integer noOfTeam, String owner, String sponser) {
	super();
	this.teamName = teamName;
	this.noOfCoach = noOfCoach;
	this.noOfTeam = noOfTeam;
	this.owner = owner;
	this.sponser = sponser;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public Integer getNoOfCoach() {
	return noOfCoach;
}
public void setNoOfCoach(Integer noOfCoach) {
	this.noOfCoach = noOfCoach;
}
public Integer getNoOfTeam() {
	return noOfTeam;
}
public void setNoOfTeam(Integer noOfTeam) {
	this.noOfTeam = noOfTeam;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String getSponser() {
	return sponser;
}
public void setSponser(String sponser) {
	this.sponser = sponser;
}

}
