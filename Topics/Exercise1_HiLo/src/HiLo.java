
public class HiLo {
    
    static int readInt() {
        return new java.util.Scanner(System.in).nextInt();       
    }
    
    static int getRandomNum() {
        return new java.util.Random().nextInt(100)+1;        
    }
    
    static int getRangedNumber(String prompt, String error, int min, int max) {
        while(true) {
            System.out.println(prompt);
            int ret = readInt();
            if(ret>=min && ret<=max) {
                return ret;
            }
            System.out.println(error);
        }
    }    
    
    static void tellPlayerGuessIsTooLow() {
        System.out.println("Higher!");
    }
    
    static void tellPlayerGuessIsTooHigh() {
        System.out.println("Lower!");
    }
    
    static void tellPlayerGussIsRight(int count) {
        System.out.println("You got it in "+count+" guesses.");
    }
    
    static void tellHighScore(int score) {
        System.out.println("The high score is "+score+" guesses.");
    }
    
    static void tellNewHighScore(int score) {
        System.out.println("That's a new high score of "+score);
    }
    
    public static int playGame(int randomNumber) {
        int count = 0;
        int guess = 0;
        do {
            guess = getRangedNumber("What is your guess?",
                    "Must be between 1 and 100.",1,100);
            count = count + 1;
            if(guess<randomNumber) {
                tellPlayerGuessIsTooLow();
            } else if(guess>randomNumber) {
                tellPlayerGuessIsTooHigh();
            }
        } while(guess!=randomNumber);
        tellPlayerGussIsRight(count);
        return count;
    }
    
    public static void main(String [] args) {
        
        int highScore = 0;
        
        while(true) {
            int myNumber = getRandomNum();        
            //System.out.println(myNumber);
            
            System.out.println("I am thinking of a number between 1 and 100.");
            System.out.println("You guess it!");
            
            int score = playGame(myNumber);
            if(score>highScore) {
                highScore = score;
                tellNewHighScore(score);
            } else {
                tellHighScore(highScore);
            }
            
            int again = getRangedNumber("Want to play again? 1=YES, 0=NO",
                    "1=YES or 0=NO",0,1);
            if(again==0) {
                break;
            }
            
        }
                
        System.out.println("Thanks for playing.");
        
    }

}
