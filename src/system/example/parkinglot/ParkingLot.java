package system.example.parkinglot;

import system.example.vehicles.Vehicle;

import java.util.List;

public class ParkingLot {
    List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingSpot findAvailableSpot(String vehicleType) {
        for(ParkingFloor floor : floors) {
            ParkingSpot spot  = floor.getAvailableSpot(vehicleType);

            if(spot != null) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle  vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if(spot != null) {
            spot.parkVehicle(vehicle);
            System.out.println("Parked Vehicle " + vehicle.getVehicleType());
            return spot;
        }

        System.out.println("Parking Spot not found");
        return null;
    }
    public void vacateVehicle(ParkingSpot spot, Vehicle vehicle) {
        if(spot != null && spot.isOccupied() && spot.vehicle.equals(vehicle)) {
            spot.vacate();
            System.out.println("Vacated Vehicle " + vehicle.getVehicleType());
        } else {
            System.out.println("Invalid operation! Either the spot is already vacant or the vehicle does not match.");
        }
    }

    public ParkingSpot getSpot(int spotNumber) {
        for(ParkingFloor floor : floors) {
            for(ParkingSpot spot : floor.getSpots()) {
                if(spot.getSpotNumber() == spotNumber) {
                    return spot;
                }
            }
        }
        return null;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
