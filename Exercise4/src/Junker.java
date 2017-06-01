import java.util.Random;

public class Junker extends ChevyVega {
    
    int tries;
    
    @Override
    public void moveTo(int location) {
        tries = tries + 1;
        if(tries == 6) {
            tries = 0;
            super.moveTo(location);
        } else {
            Random rand = new Random();
            super.moveTo(rand.nextInt());
        }
        
    }
    
}
