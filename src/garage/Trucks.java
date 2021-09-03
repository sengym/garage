package garage;

public class Trucks extends Vehicle{

	private boolean leisure;
	private int doors;
	
	public Trucks(String name, boolean isElectric, int noofWheels, int year, int iD, boolean leisure, int doors) {
		super(name, isElectric, noofWheels, year, iD);
		this.leisure = leisure;
		this.doors = doors;
		
	}

	public boolean isLeisure() {
		return leisure;
	}

	public void setLeisure(boolean leisure) {
		this.leisure = leisure;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}


	@Override
	public float calcBill() {
		
		int totalbill = 5000;
		
		if (year <= 2000) {
			
			totalbill += 1000;
		}
		else {
			
			totalbill += 3000;
		}
		
		if (isElectric == true) {
			
			totalbill += 5000;
					
		}
		
		if (leisure == false)
			
			totalbill += 1000; 
		
		totalbill += (25000 + noofWheels*5000 + doors*1000);
		
		return totalbill;
	}
}
