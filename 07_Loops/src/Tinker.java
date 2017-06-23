
public class Tinker {

	// I am suppressing a warning. The compiler realizes that "4<5" will
	// ALWAYS be true and the next line can never be executed. It warns
	// me that that line is "dead code". I know it is! This is just an
	// example.
	@SuppressWarnings("unused") // Unused code ... dead code
	
	public static void main(String[] args) {
		
		// An easy way
		for(int x=2;x<=20;++x) {
			if(x%2==0) {
				System.out.println(x);
			}
		}
		
		// Fewer iterations in the loop
		for(int x=2;x<=20;x=x+2) {
			System.out.println(x);
		}
		
		// Do while-false simply passes through the loop one time.
		System.out.println("Here 1");
		do {
			System.out.println("Here 2");
		} while(false);
		System.out.println("Here 3");
		
		// People will often wrap code in a do/while-false so that
		// they can "break" to the bottom of the code. It's kind
		// of an "abort" process.
		System.out.println("Here A");
		do {
			System.out.println("Here B");
			if(4<5) break;			
			System.out.println("Here C"); // We jump over this statement
		} while(false);
		System.out.println("Here D");
		
		// Loop within a loop
		for(int x=0;x<20;++x) {
			System.out.println("X="+x);
			for(int y=0;y<x;++y) {
				System.out.print(y+","); // Just a "print" here ... no line feed
			}
			System.out.println("");
		}
		
	}
	
	
		
}
