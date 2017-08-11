package vehicles;

public interface Vehicle {
    
    public boolean isDirty();
    
    public boolean isStarted();
        
    public int getLocation();
    
    public void setDirty(boolean dirt);
    
    public void start();
    
    void stop();  
    
    public void moveTo(int location);

}
