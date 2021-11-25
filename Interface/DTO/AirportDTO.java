
package com.xwork.DTO;

public class AirportDTO {
private String id;
private String name;
private String type;
private  String location;
public AirportDTO() {

}
public AirportDTO(String id, String name, String type, String location) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.location = location;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}
