import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(){
        radius=5;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public void displayDetails(){
        System.out.println("Radius value :"+radius);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Circle circle1=new Circle();
        circle1.displayDetails();

        System.out.println("Enter the radius: ");
        double radius=input.nextDouble();
        Circle circle2=new Circle(radius);
        circle2.displayDetails();
    }
}
