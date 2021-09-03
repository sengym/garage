package garage;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle truck1 = new Trucks("Toyota", false, 4, 2000, 1, false, 2);
		
		
// create garage as object assessing it as an object (could do static but preferred)
		Garage garage = new Garage(); 
		
		
		garage.addVehicle(truck1);
	}
}
