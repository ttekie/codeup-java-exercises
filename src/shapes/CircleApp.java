package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        // instantiate the Input class
        Input input = new Input();
        boolean userReply;
        // Bonus
        do {
            double userInput = input.getDouble("Enter radius of a circle:");
            // instantiate the circle class
            Circle circle = new Circle(userInput);
            System.out.printf("Area of circle: %.2f%n", circle.getArea());
            System.out.printf("Circumference of a circle: %.2f%n", circle.getCircumference());
            userReply = input.yesNo("Do you want continue creating a circle? (yes/no)");
        } while (userReply);

    }
}
