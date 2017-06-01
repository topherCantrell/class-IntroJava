import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class Point implements Comparable<Point> {
    
    int x,y;

    public Point(int i, int j) {
        x = i;
        y = j;
    }
    
    @Override
    public String toString() {
        return x+","+y;
    }

    @Override
    public int compareTo(Point other) {
        if(x > other.x) return 1;  // "this" is greater
        if(x < other.x) return -1; // "this" is less
        return 0; // "this" is the same
    }
    
}

class Planet extends ArrayList<Map<String,Point>> {    
}

class SolarSystem extends HashMap<String,Planet> {    
}

public class Tinker {
    
    public static void main(String [] args) {
        
       
        
        List<Map<String, Point>> planet = 
                new ArrayList<Map<String, Point>>();
        
        Map<String,List<Map<String, Point>>> sys = 
                new HashMap<String,List<Map<String, Point>>>();
                        
        Planet earth = new Planet();
        SolarSystem sol = new SolarSystem();
        sol.put("Earth", earth);
        
        
      
        
    }

}
