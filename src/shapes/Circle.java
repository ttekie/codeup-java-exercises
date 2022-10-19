package shapes;

public class Circle {
    private double radius;

    // constructor method
    public Circle(double radius) {
        this.radius = radius;
    }
    // getter method
    public double getRadius() {
        return radius;
    }
    // setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // instance method
    public double getArea() {
        // A = PI(radius)squired
        return Math.PI * Math.pow(radius, 2);
    }
    // instance method
    public double getCircumference() {
        // C = 2PI(radius)
        return 2 * Math.PI * radius;
    }
}
