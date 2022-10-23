package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("Area of the rectangle is: " + box1.getArea());
//        System.out.println("Perimeter of the rectangle is: " + box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println("Area of a square is: " + box2.getArea());
//        System.out.println("Perimeter of the square is: " + box2.getPerimeter());

        Measurable myShape = new Square(5, 5);
        System.out.println("Perimeter of a Square is: " + myShape.getPerimeter());
        System.out.println("Area of Square is: " + myShape.getArea());
        myShape = new Rectangle(6, 8);
        System.out.println("Perimeter of a Rectangle is: " + myShape.getPerimeter());
        System.out.println("Area of a Rectangle is: " + myShape.getArea());
    }
}
