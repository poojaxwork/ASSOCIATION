package com.xwork.dp.dto;

public class InstagramApplicationDTO extends ApplicationDTO {
private long totoalUsers;
private String serverLocation;
public InstagramApplicationDTO() {
	System.out.println("invoked no-arg Instagram constructor");
}
public InstagramApplicationDTO(long totoalUsers, String serverLocation) {
	super("Watsapp", "2.19.134", "Watsapp.Inc", "Jan Koum");
	this.totoalUsers = totoalUsers;
	this.serverLocation = serverLocation;
}
public long getTotoalUsers() {
	return totoalUsers;
}
public void setTotoalUsers(long totoalUsers) {
	this.totoalUsers = totoalUsers;
}
public String getServerLocation() {
	return serverLocation;
}
public void setServerLocation(String serverLocation) {
	this.serverLocation = serverLocation;
}



}
