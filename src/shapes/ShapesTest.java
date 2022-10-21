package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Area of the rectangle is: " + box1.getArea());
        System.out.println("Perimeter of the rectangle is: " + box1.getPerimeter());
        Rectangle box2 = new Square(5);
        System.out.println("Area of a square is: " + box2.getArea());
        System.out.println("Perimeter of the square is: " + box2.getPerimeter());
    }
}
