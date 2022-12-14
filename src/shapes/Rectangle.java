package shapes;

//public class Rectangle {
//    protected int width;
//
//    protected int length;
//
//    // default constructor
//    public Rectangle() {}
//
//    // custom constructor
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//    // getter method
//    public int getLength() {
//        return length;
//    }
//    // setter method
//    public void setLength(int length) {
//        this.length = length;
//    }
//    // getter method
//    public int getWidth() {
//        return width;
//    }
//    // setter method
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    //area = length x width
//    public int getArea() {
//        return width * length;
//    }
//    //perimeter = 2 x length + 2 x width
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//}

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
