package shapes;//package shapes;
//// square inherit Rectangle
//public class Square extends Rectangle{
//    private int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//    // area = side ^ 2
//    public int getArea() {
//        return (int) Math.pow(side, 2);
//    }
//    // perimeter = 4 x side
//    public int getPerimeter() {
//        return 4 * side;
//    }
//}

public class Square extends Quadrilateral implements Measurable{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * (width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}