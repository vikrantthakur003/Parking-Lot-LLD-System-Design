package system.example.parkinglot;

import system.example.vehicles.Vehicle;

public abstract class ParkingSpot {
    String spotType;
    int spotNumber;
    Vehicle vehicle;
    boolean isOccupied;

    public ParkingSpot(String spotType, int spotNumber) {
        this.spotType = spotType;
        this.spotNumber = spotNumber;
    };

    public boolean isOccupied(){
        return isOccupied;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            throw new IllegalStateException("Spot is occupied");
        } else if(!canParkVehicle(vehicle)){
            System.out.println("Spot is not suitable for your " + vehicle.getVehicleType());
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate(){
        if(!isOccupied){
            System.out.println("Spot is already vacant.");
        }
        this.isOccupied = false;
        this.vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSpotType(){
        return spotType;
    }

    public int getSpotNumber(){
        return spotNumber;
    }
}
