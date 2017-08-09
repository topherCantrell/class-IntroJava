import vehicles.Vehicle;

public class Garage {
    
    public void parkVehicle(Vehicle v) { 
        Driver dr = new Driver();
        dr.moveVehicle(v, 100);
    }
    
    public static void main(String [] args) {
        
        Garage gar = new Garage();
        
        Vehicle v = new Debug();
        
        gar.parkVehicle(v);
    }

}

