package garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicles = new ArrayList<>();

// of datatype vehicle
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
		System.out.println("Added Vehicle " + vehicle.getName());
		
}
	public void removeVehicle(int id) {
}
	
}
