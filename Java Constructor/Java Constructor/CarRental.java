import java.util.Scanner;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double price;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.price=200;
    }

    public void displayDetails(){
        System.out.println("Customer Name :"+customerName);
        System.out.println("Car Model is : "+carModel);
        System.out.println("Rental days is "+rentalDays);
        System.out.println("Total price is "+rentalDays*price);

    }
    public double getPrice(){
        return price;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");
        String customerName = input.nextLine();
        System.out.println("Enter the carmodel :");
        String carmodel = input.nextLine();
        System.out.println("Enter the no of rental days :");
        int rentaldays = input.nextInt();

        CarRental carrental1 = new CarRental(customerName, carmodel, rentaldays);
        carrental1.displayDetails();
    }
}
