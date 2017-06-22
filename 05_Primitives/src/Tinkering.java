
public class Tinkering {

	public static void main(String[] args) {
		
		int value = 23;
		System.out.println("23 shift left 3 is "+(value<<3));
		System.out.println("23 shift right 2 is "+(value>>2));
		
		// 23 shift left 3 is 184 (23*8)
		// 23 shift right 2 is 5 (23/4 = 20 rem 3)
		// Shift left is multiply by 2
		// Shift right is divide by 2
		
		// A 4m car moving 250_000_000 m/s
		double lenapp = getApparantLength(4.0,250_000_000);
		
		System.out.println("The car looks to be " + lenapp + " meters long");
		// The car looks to be 2.211083193570267 meters long
				
	}
	
	static double getApparantLength(double length, double velocity) {
		double c = 300_000_000;
		return length * Math.sqrt( 1.0 - (velocity*velocity) / (c*c));
	}

}
