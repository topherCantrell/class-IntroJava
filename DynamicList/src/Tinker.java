import java.util.HashMap;


class Point {

    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return x+","+y;
    }
}

class Line {
    
}

public class Tinker {
    
    static void printPoints(DynamicList list) {
        int size = list.getSize();
        for(int x=0;x<size;++x) {
            Point p = (Point)list.getElement(x);
            System.out.println(p);
        }
    }
    
    public static void main(String [] args) {
                        
        DynamicList<Point> points = new DynamicList<Point>();
        points.addElement(new Point(1,2));
        Point p = points.getElement(0);
        
        DynamicList<Line> lines = new DynamicList<Line>();
        lines.addElement(new Line());
        Line a = lines.getElement(0);
        
        HashMap<String,Point> map = new HashMap<String,Point>();
                      
    }

}
