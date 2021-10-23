package com.xwork.dto.dp;

public class CraneDTO {
	private String name;
	private float height;
	private String  scientificName; 
	private String color;
	private String season ;
	private boolean aqatic;
	private boolean migrate;
	public CraneDTO() {
		System.out.println("Crane is invoked");
	}
	public CraneDTO(String name, float height, String scientificName, String color, boolean aqatic, boolean migrate) {
		super();
		this.name = name;
		this.height = height;
		this.scientificName = scientificName;
		this.color = color;
		this.aqatic = aqatic;
		this.migrate = migrate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getScientificName() {
		return scientificName;
	}
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isAqatic() {
		return aqatic;
	}
	public void setAqatic(boolean aqatic) {
		this.aqatic = aqatic;
	}
	public boolean isMigrate() {
		return migrate;
	}
	public void setMigrate(boolean migrate) {
		this.migrate = migrate;
	}
	public void setSeason(String season) {
		this.season = season;
	}
public String getSeason() {
	return season;
	
}

 public class CarpenterDTO
{
	
private String name;
private float charges;
private String service;
private long phoneNo;
private String address;
private String workingHours;
private boolean goodWorker;
public CarpenterDTO() {
	System.out.println("const is invoked");
}
public CarpenterDTO(String name, float charges, String service, long phoneNo, String address, String workingHours,
		boolean goodWorker) {
	super();
	this.name = name;
	this.charges = charges;
	this.service = service;
	this.phoneNo = phoneNo;
	this.address = address;
	this.workingHours = workingHours;
	this.goodWorker = goodWorker;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getCharges() {
	return charges;
}
public void setCharges(float charges) {
	this.charges = charges;
}
public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getWorkingHours() {
	return workingHours;
}
public void setWorkingHours(String workingHours) {
	this.workingHours = workingHours;
}
public boolean isGoodWorker() {
	return goodWorker;
}
public void setGoodWorker(boolean goodWorker) {
	this.goodWorker = goodWorker;
}

}
  public class BusDriverDTO
	{
		private String name;
		private float salary;
		private String type;
		private String busType;
		private String dlId;
		private int age;
		private boolean work;
		
		public BusDriverDTO() {
			System.out.println("const is invoked");
		}

		public BusDriverDTO(String name, float salary, String type, String busType, String dlId, int age, boolean work) {
			super();
			this.name = name;
			this.salary = salary;
			this.type = type;
			this.busType = busType;
			this.dlId = dlId;
			this.age = age;
			this.work = work;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBusType() {
			return busType;
		}

		public void setBusType(String busType) {
			this.busType = busType;
		}

		public String getDlId() {
			return dlId;
		}

		public void setDlId(String dlId) {
			this.dlId = dlId;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int i) {
			this.age = i;
		}

		public boolean isWork() {
			return work;
		}

		public void setWork(boolean work) {
			this.work = work;
		}
		
		
		
	}

}

