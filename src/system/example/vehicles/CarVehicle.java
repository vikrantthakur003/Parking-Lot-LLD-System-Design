package system.example.vehicles;

public class CarVehicle extends Vehicle {
    double RATE = 10.00;

    public CarVehicle(String licensePlate){
        super("Car", licensePlate);
    }

    public double calculate(int hourStayed){
        return hourStayed * RATE;
    }
}
