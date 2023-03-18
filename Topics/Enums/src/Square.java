
public final class Square extends Object {
    
    public static final Square EMPTY = new Square("EMPTY",0);
    public static final Square X     = new Square("X",1);
    public static final Square O     = new Square("O",2);
    
    public static Square[] values() {return null;}
    public static Square valueOf(String name) {return null;}
    
    private Square(String name, int ordinal) {
        //super(name,ordinal);
    }
    
    // Available from Enum<Square>:
    //    public int compareTo(Square)
    //    public String name()
    //    public int ordinal()
    
}
