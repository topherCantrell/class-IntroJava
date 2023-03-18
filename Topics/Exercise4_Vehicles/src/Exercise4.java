import vehicles.Vega;
import vehicles.Vehicle;

public class Exercise4 {

	// This class contains the main for the program. Once you finish an exercise,
	// rename the main to something else and start anew.
	
	
	// Be Tom: create a car that implements the Vehicle interface. Create a static 
	// function "mainOne" and test-drive the object.	
	public static void mainOne(String[] args) {	
		
		// Simple here. Just create a vehicle and call methods on it.
		
		//Car c = new Car();
		Vehicle v = new Car();
		
		// Let's play with this vehicle ... so many things we can do to it.
		v.start();
		System.out.println(v.isStarted());
		v.moveTo(234);
		System.out.println(v.getLocation());
		v.setDirty(true);
		System.out.println(v.isDirty());
		v.stop();
		v.setDirty(false);
		System.out.println(v.isDirty());
		System.out.println(v.isStarted());

	}
	
	// Be Dick: create a "Garage" class with a "parkVehicle" method. This method should 
	// take any vehicle and move it to location "100" (where the garage is). In "mainTwo" you 
	// should "new" one of your cars and park it.
	public static void mainTwo(String [] args) {
		
		Vehicle v = new Car();
		Garage g = new Garage();
		
		// Not much to it. The Garage handles starting, moving, and stopping
		// the vehicle. That is its job!
		
		System.out.println(v.getLocation());
		g.parkVehicle(v);
		System.out.println(v.getLocation());
		
	}
	
	// Be Harry: create a "Carwash" class with a "washVehicle" method. This method should take 
	// any vehicle and move it to location "200" (where the carwash is). Then set the vehicle 
	// to "clean" and move it back to wherever it was. In "mainThree" you should "New" one of 
	// your cars and wash it.	
	public static void mainThree(String [] args) {
		
		Vehicle v = new Car();
		Carwash w = new Carwash();
		
		// Not much to it. The Carwash handles starting, moving, and stopping
		// the vehicle. That is its job!
		
		v.setDirty(true); // Let's get the car dirty!
		System.out.println(v.getLocation());
		w.washVehicle(v);
		System.out.println(v.getLocation()); // Are we back?
		System.out.println(v.isDirty()); // Are we clean?
		
	}
	
	// Add "smarts" to your Car implementation. It must be started or the "move" function should 
	// do nothing. Test several cases in "mainFour".
    public static void mainFour(String [] args) {
		
		Vehicle v = new Car();
		
		System.out.println(v.getLocation());
		v.moveTo(99); // Should FAIL ... we aren't started!
		System.out.println(v.getLocation());
		
		// Let's start it up and drive it around
		v.start();
		v.moveTo(99); // First to this spot
		System.out.println(v.getLocation());
		v.moveTo(50); // Then to this spot
		System.out.println(v.getLocation());
		
		v.stop(); // Car should not move unless restarted
		
		System.out.println(v.isStarted());
		v.moveTo(33); // Should FAIL ... we aren't started!
		System.out.println(v.getLocation());
		
	}
    
    // Create a "RustyCar" class. It takes five washes to get it clean. How does 
    // your Carwash class handle that? Show me in "mainFive".
    public static void mainFive(String [] args) {
		
		Vehicle v = new RustyCar();
		Carwash w = new Carwash();
		
		v.setDirty(true);
		System.out.println(v.isDirty());
		w.washVehicle(v); // I had to modify the carwash to keep trying!
		System.out.println(v.isDirty());
		
    }
    
    // Create the "Junker" class. It is basically a "RustyCar", but you have to call "start" 
    // three times to get it to start. Show me in "mainSix".
    public static void mainSix(String [] args) {
		
		Vehicle v = new Junker();
		
		while(!v.isStarted()) {
			System.out.println("Trying to start ...");
			v.start();
		}
		
		System.out.println(v.isStarted());
		
    }
    
    // "New" the Vega vehicle in the JAR file. How do your Garage and Carwash handle 
    // these new objects? Tweak your Carwash and Garage code until you can wash and park 
    // a Vega instance. This should be "mainSeven".
    public static void mainSeven(String [] args) {
		
		Vehicle v = new Vega();
		
		Carwash w = new Carwash();
		Garage g = new Garage();
		
		// Let's try parking the Vega
		System.out.println(v.getLocation());
		g.parkVehicle(v);
		System.out.println(v.getLocation()); // Did it move?
		System.out.println(v.isStarted()); // Hopefully it is off!
		
		System.out.println("-----");
		
		// Let's try washing the Vega
		System.out.println(v.getLocation());
		w.washVehicle(v);
		System.out.println(v.getLocation()); // Did it come back?
		System.out.println(v.isStarted()); // Hopefully it is off!
		
    }
    
    // Have the Garage use the Carwash before every park. This is "mainEight".
    public static void main(String [] args) {
    	
    	Vehicle v = new Vega();
    	
    	v.setDirty(true); // Get it dirty
		
		Garage g = new Garage();
		
		g.washAndPark(v);
		
		System.out.println(v.getLocation()); // Better be 100 (the Garage)
		System.out.println(v.isDirty()); // Better be false (cleaned up)
		
    }

}
