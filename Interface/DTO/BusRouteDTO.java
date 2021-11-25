package com.xwork.DTO;

public class BusRouteDTO {
	private String id;
	private String StartPoint;
	private String destination;
	private String driverName;

	public BusRouteDTO() {
		System.out.println("invoked no-arg constructor");
	}

	public BusRouteDTO(String id, String startPoint, String destination, String driverName) {
		super();
		this.id = id;
		StartPoint = startPoint;
		this.destination = destination;
		this.driverName = driverName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartPoint() {
		return StartPoint;
	}

	public void setStartPoint(String startPoint) {
		StartPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
