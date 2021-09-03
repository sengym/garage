package garage;

public class Cars extends Vehicle {
	
	private boolean sportscar;
	private int seats;
	
	
	public Cars(String name, boolean isElectric, int noofWheels, int year, int iD, boolean sportscar, int seats) {
		super(name, isElectric, noofWheels, year, iD);
		// TODO Auto-generated constructor stub
		this.sportscar = sportscar; 
		this.seats = seats; 
	}


	public boolean isSportscar() {
		return sportscar;
	}

	public void setSportscar(boolean sportscar) {
		this.sportscar = sportscar;
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
			
			totalbill += 7000;
		}
		
		if (isElectric == true) {
			
			totalbill += 5000;
					
		}
		
		if (sportscar == true)
			
			totalbill += 100000; 
		
		totalbill += (25000 + noofWheels*50 + seats*100);
		
		return totalbill;
	}

}
