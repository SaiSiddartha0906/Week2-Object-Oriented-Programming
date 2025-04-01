class Veh {
    private String model;
    private int maxSpeed;


    public Veh(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {

    void refuel();
}

class ElectricVehicle extends Veh {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle with " + batteryCapacity + " kWh battery capacity.");
    }
}

class PetrolVehicle extends Veh implements Refuelable {
    private int fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle with " + fuelTankCapacity + " liters of fuel.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();


        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);
        System.out.println("\nPetrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}