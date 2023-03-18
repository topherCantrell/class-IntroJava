
public class Time {
    
    int hms;
    
    int getHours() {
        return hms/60;
    }
    
    int getMinutes() {
        return (hms/60)%60;
    }
    
}
