package system.example.vehicles;

public class BikeVehicle extends Vehicle {
    double RATE = 5.0;

    public BikeVehicle(String licensePlate){
        super("Bike", licensePlate);
    }
    public double calculate(int hourStayed) {
        return hourStayed * RATE;
    }
}
