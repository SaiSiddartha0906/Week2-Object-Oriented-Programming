import java.util.Scanner;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee=10000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner name is : "+ownerName);
        System.out.println("Vehicle Details : "+vehicleType);
        System.out.println("Registration Fee : "+Vehicle.registrationFee);
    }

    public static void updateRegistrationFee(double newfee){
        Vehicle.registrationFee=newfee;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1. Display Vehicle Details\n 2. update registration fee\n 3.exit ");
            int choice= input.nextInt();
            input.nextLine();
            if (choice==3){
                break;
            }
            else if(choice==2){
                System.out.println("Enter the new registration fee : ");
                double newfee=input.nextDouble();
                Vehicle.updateRegistrationFee(newfee);
            }
            else{
                System.out.println("Enter your name : ");
                String ownerName= input.nextLine();
                System.out.println("Enter the vehicle type : ");
                String vehicletype=input.nextLine();
                Vehicle vehicle1=new Vehicle(ownerName,vehicletype);
                vehicle1.displayVehicleDetails();
            }
        }
    }
}
