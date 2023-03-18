public class Junker extends RustyCar {
    
    int tries;
    
    @Override
    public void start() {
    	if(tries == 2) {
    		super.start();
    		tries = 0;
    	} else {
    		++tries;
    	}
    }
    
}
