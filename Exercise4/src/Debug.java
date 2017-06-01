
public class Debug implements Vehicle {
    
    private boolean dirty;
    private boolean started;
    private int location;

    @Override
    public boolean isDirty() {
        System.out.println("Called 'isDirty'. Returning '"+dirty+"'");
        return dirty;
    }

    @Override
    public boolean isStarted() {
        System.out.println("Called 'isStarted'. Returning '"+started+"'");
        return started;
    }

    @Override
    public int getLocation() {
        System.out.println("Called 'getLocation'. Returning '"+location+"'");
        return location;
    }

    @Override
    public void setDirty(boolean dirt) {
        System.out.println("Called 'setDirty("+dirt+")'.");
        dirty = dirt;        
    }

    @Override
    public void start() {
        System.out.println("Called 'start()'.");   
        started = true;
    }
    
    @Override
    public void stop() {
        System.out.println("Called 'stop()'.");
        started = false;
    }

    @Override
    public void moveTo(int location) {
        System.out.println("Called 'moveTo("+location+")'.");
        this.location = location;
    }
    
    public static void main(String [] args) {
        
        Vehicle v = new Debug();
        v.start();
        System.out.println(v.isStarted());
        v.moveTo(100);
        System.out.println(v.getLocation());
        v.stop();
        System.out.println(v.isStarted());
        
    }

}
