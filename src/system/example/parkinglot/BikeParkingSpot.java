package system.example.parkinglot;

import system.example.vehicles.Vehicle;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(int spotNumber){
        super("Bike", spotNumber);
    }

    public boolean canParkVehicle(Vehicle vehicle){
        return "Bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
