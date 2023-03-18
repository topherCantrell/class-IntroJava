import vehicles.Vehicle;

public class DebugVehicle implements Vehicle {
    
    Vehicle target;
    
    // Simple decorator for debugging the Vehicle interface. Use it like this:
    // Vehicle v = new Debug(new Vega()); // Or whatever vehicle you want on the inside.
    
    // This is NOT part of the exercise, but it is helpful and interesting!
    
    public DebugVehicle(Vehicle v) {
    	target = v;
    }

    @Override
    public boolean isDirty() {
    	boolean dirty = target.isDirty();
        System.out.println("Called 'isDirty'. Returning '"+dirty+"'");
        return dirty;
    }

    @Override
    public boolean isStarted() {
    	boolean started = target.isStarted();
        System.out.println("Called 'isStarted'. Returning '"+started+"'");
        return started;
    }

    @Override
    public int getLocation() {
    	int location = target.getLocation();
        System.out.println("Called 'getLocation'. Returning '"+location+"'");
        return location;
    }

    @Override
    public void setDirty(boolean dirt) {
        System.out.println("Called 'setDirty("+dirt+")'.");
        target.setDirty(dirt);        
    }

    @Override
    public void start() {
        System.out.println("Called 'start()'.");   
        target.start();
    }
    
    @Override
    public void stop() {
        System.out.println("Called 'stop()'.");
        target.stop();
    }

    @Override
    public void moveTo(int location) {
        System.out.println("Called 'moveTo("+location+")'.");
        target.moveTo(location);
    }

}
