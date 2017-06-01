
public class ChevyVega extends RustyCar {
    
    int tries;
    
    @Override
    public void start() {
        tries = tries + 1;    
        if(tries==4) {
            tries = 0;
            super.start();
        }
    }
    
    @Override
    public void stop() {
        tries = tries + 1;    
        if(tries==4) {
            tries = 0;
            super.stop();
        }
    }

}
