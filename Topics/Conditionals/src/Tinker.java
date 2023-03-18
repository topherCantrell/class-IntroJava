
public class Tinker {
	
	public static void main(String [] args) {
		
		isUpperCase('A'); // Should be YES
		isUpperCase('a'); // Should be NO
		
		isEven(24); // Should be YES
		isEven(25); // Should be NO
		
		
	}
	
	public static void isUpperCase(char c) {
		
		if(c>='A' && c<='Z') {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		// We will see later that the Character class has a
		// helper function:
		// if( Character.isUpperCase(c)) { ... }
		
	}
	
	public static void isEven(int value) {
		int test = value % 2;
		if(test==0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
