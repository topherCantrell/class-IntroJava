
public class Tinker4 {

	public static int addThem(int a, int b) {
		int c = a + b;
		return c;         
	}
	
	public static void causeTrouble() {
		// This function calls itself infinitely.
		// Each time it does it adds a little information for the
		// computer remember how to get back. This information takes
		// memory -- memory on the stack. Eventually the stack fills
		// up and "overflows" with a "java.lang.StackOverflowError".
		//
		// Stack Overflows can happen in most all languages. The term
		// is where the site "stackoverflow.com" gets its name.
		causeTrouble();
	}

	public static void main(String [] args) {        
		int a = addThem(3,7);
		System.out.println(a);
		a = addThem(a,2);
		System.out.println(a);
		addThem(100,100);     
		
		causeTrouble();
		
	}
		
}
