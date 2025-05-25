package system.example.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    List<ParkingSpot> spots;
    int floorNumber;

    public ParkingFloor(int numOfBikeSpots, int numOfCarSpots, int floorNumber){
        this.floorNumber = floorNumber;
        spots = new ArrayList<>();

        for(int i = 0; i < numOfBikeSpots; i++){
            spots.add(new BikeParkingSpot(i + 1));
        }

        for(int i = numOfBikeSpots; i < numOfBikeSpots + numOfCarSpots; i++){
            spots.add(new CarParkingSpot(i + 1));
        }
    }

    public ParkingSpot getAvailableSpot(String vehicleType){
       for(ParkingSpot spot : spots){
           if(!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicleType)){
               return spot;
           }
       }
       return null;
    }

    public List<ParkingSpot> getSpots(){
        return spots;
    }
}
