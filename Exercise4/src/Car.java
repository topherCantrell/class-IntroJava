
public class Car implements Vehicle {
    
    private boolean dirty;
    private boolean started;
    private int location;

    @Override
    public boolean isDirty() {
        return dirty;
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    @Override
    public int getLocation() {
        return location;
    }

    @Override
    public void setDirty(boolean dirt) {
        dirty = dirt;        
    }

    @Override
    public void start() {
        started = true;
    }
    
    @Override
    public void stop() {
        started = false;
    }

    @Override
    public void moveTo(int location) {
        if(isStarted()) {
            this.location = location;
        }
    }
    
}
