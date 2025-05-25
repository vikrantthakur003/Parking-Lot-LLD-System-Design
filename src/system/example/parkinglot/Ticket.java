package system.example.parkinglot;

import system.example.vehicles.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    ParkingLot parkingLot;
    Vehicle vehicle;
    LocalDateTime startTime;

    Ticket(ParkingLot parkingLot, Vehicle vehicle){
        this.parkingLot = parkingLot;
        this.vehicle = vehicle;
        this.startTime = LocalDateTime.now();
    }
}
