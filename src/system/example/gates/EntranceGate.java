package system.example.gates;

import system.example.parkinglot.ParkingLot;
import system.example.parkinglot.ParkingSpot;
import system.example.vehicles.Vehicle;
import system.example.vehicles.VehicleFactory;

import java.util.Scanner;

public class EntranceGate {
    ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void processEntrance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter License plate number: ");
        String licensePlate = scanner.nextLine();

        System.out.println("Enter Vehicle Type from (Car and Bike)");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType, licensePlate);
        if(vehicle == null){
            System.out.println("Invalid Vehicle Type");
        }

        ParkingSpot spot = parkingLot.parkVehicle(vehicle);
        if(spot == null){
            System.out.println("No available spots for the vehicle type.");
        } else {
            System.out.println("Vehicle parked successfully in spot: " + spot.getSpotNumber());
        }
    }
}
