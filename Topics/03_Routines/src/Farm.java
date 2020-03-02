
public class Farm {
	
	public static void singEIEIO() {
        System.out.println("E I E I O");
    }
	
	// Passing in the animal as a parameter. More on how to use "+" to
	// combine strings later.
    public static void singSong(String animal) {	    	
    	System.out.println("And on that farm he had some "+animal+"s.");
        singEIEIO();
        System.out.println("With a "+animal+"-"+animal+" here and a "+animal+"-"+animal+" there.");
        System.out.println("Here a "+animal+". There a "+animal);
        System.out.println("Everywhere a "+animal+"-"+animal+".");
        singEIEIO();		
        System.out.println("");
    }
	
    public static void main(String[] args) {
    	System.out.println("Old McDonald had a farm.");
    	singEIEIO();
        singSong("cow");
        singSong("pig");
        singSong("chicken");
    }

}
