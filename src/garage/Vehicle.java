package garage;

public abstract class Vehicle {
// abstract because it cannot create a vehicle from 
//vehicle but only from motorcycle / cars 
	
	public String name; 
	public boolean isElectric;
	public int noofWheels;
	public int year; 
	public int ID;
	

public Vehicle(String name, boolean isElectric, int noofWheels, int year, int iD) {
		super();
		this.name = name;
		this.isElectric = isElectric;
		this.noofWheels = noofWheels;
		this.year = year;
		ID = iD;
	}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public boolean isElectric() {
	return isElectric;
}


public void setElectric(boolean isElectric) {
	this.isElectric = isElectric;
}


public int getNoofWheels() {
	return noofWheels;
}


public void setNoofWheels(int noofWheels) {
	this.noofWheels = noofWheels;
}


public int getYear() {
	return year;
}



public void setYear(int year) {
	this.year = year;
}


public int getID() {
	return ID;
}



public void setID(int iD) {
	ID = iD;
}


public abstract float calcBill(); 

	
}
