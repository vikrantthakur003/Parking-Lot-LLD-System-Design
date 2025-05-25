package system.example.vehicles;

public abstract class Vehicle {
    String vehicleType;
    String licensePlate;

    public Vehicle(String vehicleType, String licensePlate) {
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract double calculate(int hourStayed);
}
