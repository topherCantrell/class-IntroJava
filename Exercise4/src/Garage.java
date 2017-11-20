import vehicles.Vehicle;

public class Garage {
	
	// This is our own personal carwash object! Did you pass in
	// the Carwash object to the Garage constructor? That's fine
	// too.
	Carwash wash = new Carwash();
    
    public void parkVehicle(Vehicle v) { 
        Driver dr = new Driver();
        dr.moveVehicle(v, 100);
    }
    
    // I decided to make a separate method here instead of
    // modifying the "parkVehicle". You probably modified the
    // original method as requested. Another solution would
    // be to subclass Garage into "WashingGarage".
    public void washAndPark(Vehicle v) {    	
    	wash.washVehicle(v);
    	parkVehicle(v);
    }
    
}

