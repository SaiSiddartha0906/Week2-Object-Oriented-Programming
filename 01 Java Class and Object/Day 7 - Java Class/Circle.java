import java.util.Scanner;

public class Circle {
    private double radius;
    private static final double PI = 3.14; 

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.printf("Circumference of the circle is: %.2f\n", getCircumference());
        System.out.printf("Area of the circle is: %.2f\n", getArea());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius value: ");
        double radius = input.nextDouble();
        input.close();

        Circle circle1 = new Circle(radius);
        circle1.displayDetails();
    }
}