import vehicles.Vehicle;

public class Carwash {
    
    public void washVehicle(Vehicle v) {   
        
        Driver dr = new Driver();
        int cur = v.getLocation();
        
        dr.moveVehicle(v,200);
        
        while(v.isDirty()) {
        	v.setDirty(false);
        }
                        
        dr.moveVehicle(v,cur);
    }
       
}

