
public class Carwash {
    
    public void washVehicle(Vehicle v) {   
        
        Driver dr = new Driver();
        int cur = v.getLocation();
        
        dr.moveVehicle(v,100);
        
        for(int x=0;x<10;++x) {
            v.setDirty(false);
        }
        
        dr.moveVehicle(v,cur);
    }
    
    public static void main(String [] args) {
        
        Carwash wash = new Carwash();
        
        Vehicle v = new Debug();
        
        wash.washVehicle(v);
    }

}

