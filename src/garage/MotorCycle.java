package garage;

public class MotorCycle extends Vehicle {
	
	private boolean helmet; 
	private int seats;
	

	public MotorCycle(String name, boolean isElectric, int noofWheels, int year, int iD, boolean helmet, int seats) {
		super(name, isElectric, noofWheels, year, iD);
		this.helmet = helmet;
		this.seats = seats;
	}


	public boolean isHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
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
		
		if (helmet == true)
			
			totalbill += 200; 
		
		totalbill += (25000 + noofWheels*50 + seats*10000);
		
		return totalbill;
	}
}
