
public class Time {
    
    private int hms;
    
    public int getHours() {
        return hms/60;
    }
    
    public int getMinutes() {
        return (hms/60)%60;
    }
    
}
