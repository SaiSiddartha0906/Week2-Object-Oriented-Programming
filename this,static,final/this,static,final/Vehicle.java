public class Vehicle {

    private static double registrationFee = 500.0;


    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;


    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }


    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }


    public static double getRegistrationFee() {
        return registrationFee;
    }


    public void displayDetails() {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Number: " + this.registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Static method to display registration details with instanceof check
    public static void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            System.out.println("\n--- Vehicle Registration Details ---");
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Owner: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Fee Paid: $" + registrationFee);
        } else {
            System.out.println("Error: Object is not a Vehicle instance");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static void main(String[] args) {

        Vehicle car = new Vehicle("John Smith", "Car", "KA01AB1234");
        Vehicle bike = new Vehicle("Jane Doe", "Motorcycle", "KA02CD5678");


        Vehicle.displayRegistrationDetails(car);


        System.out.println("\nUpdating registration fee...");
        Vehicle.updateRegistrationFee(750.0);


        Vehicle.displayRegistrationDetails(bike);


        System.out.println("\nTrying to display non-Vehicle object:");
        String notVehicle = "This is not a vehicle";
        Vehicle.displayRegistrationDetails(notVehicle);
    }
}
