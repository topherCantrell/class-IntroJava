import vehicles.Vehicle;

public class Driver {
	
	// Driver works with any vehicle. Just give the driver a vehicle and where
	// you want it to go. The Driver takes care of starting, moving, and stopping
	// the vehicle.
    
    public void moveVehicle(Vehicle v, int location) {
    	
    	// The motor might die along the way. Keep starting/moving
    	// until we get there!
    	while(v.getLocation()!=location) {
    		while(!v.isStarted()) {
    			v.start();
    			// TODO what if it never starts? How/when do we
    			// give up?
    		}
    		v.moveTo(location);
    	}
    	                
        while(v.isStarted()) {
            v.stop();
            // TODO what if it never stops? How/when do we give up?
        }
        
    }

}
