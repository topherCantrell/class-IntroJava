
public class RustyCar extends Car {
    
    @Override
    public void moveTo(int location) {
        setDirty(true);
        super.moveTo(location);
    }

}
