package com.xwork.dto.dp;

public class CraneDTO {
	private String name;
	private float height;
	private String scientificName;
	private String color;
	private String season;
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

	public class CarpenterDTO {

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

		public CarpenterDTO(String name, float charges, String service, long phoneNo, String address,
				String workingHours, boolean goodWorker) {
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

	public class BusDriverDTO {
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

		public BusDriverDTO(String name, float salary, String type, String busType, String dlId, int age,
				boolean work) {
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

	public class SeasonDTO {
		private String season;
		private String seasonalFruit;
		private float humidity;
		private float temperature;
		private String type;
		private boolean weather;
		private boolean Rainy;

		public SeasonDTO() {
			System.out.println("season is invoked");
		}

		public SeasonDTO(String season, String seasonalFruit, float humidity, float temperature, String type,
				boolean weather, boolean rainy) {
			super();
			this.season = season;
			this.seasonalFruit = seasonalFruit;
			this.humidity = humidity;
			this.temperature = temperature;
			this.type = type;
			this.weather = weather;
			this.Rainy = rainy;
		}

		public String getSeason() {
			return season;
		}

		public void setSeason(String season) {
			this.season = season;
		}

		public String getSeasonalFruit() {
			return seasonalFruit;
		}

		public void setSeasonalFruit(String seasonalFruit) {
			this.seasonalFruit = seasonalFruit;
		}

		public float getHumidity() {
			return humidity;
		}

		public void setHumidity(float humidity) {
			this.humidity = humidity;
		}

		public float getTemperature() {
			return temperature;
		}

		public void setTemperature(float temperature) {
			this.temperature = temperature;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public boolean isWeather() {
			return weather;
		}

		public void setWeather(boolean weather) {
			this.weather = weather;
		}

		public boolean isRainy() {
			return Rainy;
		}

		public void setRainy(boolean rainy) {
			Rainy = rainy;
		}
	}

	public class ElevatorDTO {
		private String brand;
		private float capacity;
		private int noOfperson;
		private String type;
		private boolean working;

		public ElevatorDTO() {
			System.out.println("Elevator is invoked");
		}

		public ElevatorDTO(String brand, float capacity, int noOfperson, String type, boolean working) {
			super();
			this.brand = brand;
			this.capacity = capacity;
			this.noOfperson = noOfperson;
			this.type = type;
			this.working = working;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public float getCapacity() {
			return capacity;
		}

		public void setCapacity(float capacity) {
			this.capacity = capacity;
		}

		public int getNoOfperson() {
			return noOfperson;
		}

		public void setNoOfperson(int noOfperson) {
			this.noOfperson = noOfperson;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public boolean isWorking() {
			return working;
		}

		public void setWorking(boolean working) {
			this.working = working;
		}

	}
 public class ParkDTO
{
	private String name;
	private int constYear;
	private long noOftrees;
	private float price;
	private boolean ticket;
	private float openTime;
	private float closeTime;
public ParkDTO() {
	System.out.println("Park is invoked");
}
public ParkDTO(String name, int constYear, long noOftrees, float price, boolean ticket, float openTime,
		float closeTime) {
	super();
	this.name = name;
	this.constYear = constYear;
	this.noOftrees = noOftrees;
	this.price = price;
	this.ticket = ticket;
	this.openTime = openTime;
	this.closeTime = closeTime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getConstYear() {
	return constYear;
}
public void setConstYear(int constYear) {
	this.constYear = constYear;
}
public long getNoOftrees() {
	return noOftrees;
}
public void setNoOftrees(long noOftrees) {
	this.noOftrees = noOftrees;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public boolean isTicket() {
	return ticket;
}
public void setTicket(boolean ticket) {
	this.ticket = ticket;
}
public float getOpenTime() {
	return openTime;
}
public void setOpenTime(float openTime) {
	this.openTime = openTime;
}
public float getCloseTime() {
	return closeTime;
}
public void setTicket1(boolean ticket) {
	this.ticket = ticket;
}

}
}
