package shapes;
// square inherit Rectangle
public class Square extends Rectangle{
    private final int side;
    public Square(int side) {
//        super();
        this.side = side;
    }
    // area = side ^ 2
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
    // perimeter = 4 x side
    public int getPerimeter() {
        return 4 * side;
    }
}
