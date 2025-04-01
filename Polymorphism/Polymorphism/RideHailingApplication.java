import java.util.ArrayList;
import java.util.List;

abstract class Vehi {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehi(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm + " per Km";
    }
}

interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}

class Cars extends Vehi implements GPS {
    private String currentLocation;

    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Bikes extends Vehi implements GPS {
    private String currentLocation;

    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Auto extends Vehi implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehi> vehicles = new ArrayList<>();

        Cars cars = new Cars("C101", "John Doe", 15);
        cars.updateLocation("Central Park");
        vehicles.add(cars);

        Bikes bikes = new Bikes("B202", "Jane Smith", 10);
        bikes.updateLocation("Downtown");
        vehicles.add(bikes);

        Auto auto = new Auto("A303", "Sam Wilson", 12);
        auto.updateLocation("Suburb");
        vehicles.add(auto);

        double distance = 10;

        for (Vehi vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " Km: " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }
}