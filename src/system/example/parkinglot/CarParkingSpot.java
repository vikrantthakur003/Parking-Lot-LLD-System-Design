package system.example.parkinglot;

import system.example.vehicles.Vehicle;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(int spotNumber) {
        super("Car", spotNumber);
    }
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
