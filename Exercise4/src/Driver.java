
public class Driver {
    
    public void moveVehicle(Vehicle v, int location) {
        while(!v.isStarted()) {
            v.start();
            // TODO what if it never starts?
        }
        
        while(v.getLocation()!=location) {
            v.moveTo(location);
            // TODO what if it never gets there?
        }
        
        while(v.isStarted()) {
            v.stop();
         // TODO what if it never stops?
        }
    }

}
