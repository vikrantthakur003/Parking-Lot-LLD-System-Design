package system.example.vehicles;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleType, String licensePlate) {
        switch (vehicleType) {
            case "Car":
                return new CarVehicle(licensePlate);
            case "Bike":
                return new BikeVehicle(licensePlate);
        }

        return null;
    }
}
