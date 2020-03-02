
public class RustyCar extends Car {
	
	int cleanCount;
	
	public RustyCar() {
		// Let's have the rusty car start off dirty!
		setDirty(true);
	}
	
	@Override
	public void setDirty(boolean dirty) {
		if(dirty) {
			// Set the RustyCar to dirty
			cleanCount = 5;
			super.setDirty(true);
		} else {
			// Try to set the RustyCar to clean
			if(cleanCount==0) {
				// We finally got it clean
				super.setDirty(false);
			} else {
				// Not clean yet ... keep trying
				--cleanCount;
			}
		}
	}
        
}
