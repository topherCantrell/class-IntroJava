
public class Point {
    
    static int created = 0;
    
    public static void sayHi() {
        System.out.println("There are "+created+" Points");
    }
    
    public int x;
    public int y;
    
    public Point() {}
    
    public Point(int x, int y) {
        this.x=0;
        this.y=0;
        Point.created = Point.created + 1;
    }
    
    public boolean isTheSameAs(/*Point this,*/ Point other) {
        if(other.x != this.x) return false;
        if(other.y != this.y) return false;
        return true;
    }
    
    public boolean isTheSameAs2(Point other) {
        if((other.x == this.x) && (other.y == this.y)) {
            return true;
        }
        return false;
    }
    
    public boolean isTheSameAs3(Point other) {
        return (other.x == this.x) && (other.y == this.y);
    }
    
    public void print() {
        System.out.println(x+","+y);
    }
    
    public static void main(String [] args) {
        
        Point.sayHi(); // 0
        
        Point p = new Point(1,2);
        Point q = new Point(2,4);
        
        Point.sayHi();  // 2
    }
    
}
