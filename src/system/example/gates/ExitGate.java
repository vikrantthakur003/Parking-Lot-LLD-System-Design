package system.example.gates;

import system.example.parkinglot.ParkingLot;
import system.example.parkinglot.ParkingSpot;
import system.example.payment.PaymentService;
import system.example.vehicles.Vehicle;

public class ExitGate {
    ParkingLot parkingLot;
    PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void exit(int spotNumber, int hourStayed) {
        ParkingSpot spot = parkingLot.getSpot(spotNumber);
        if(spot == null && !spot.isOccupied()){
            System.out.println("Invalid spot");
            return;
        }

        Vehicle vehicle = spot.getVehicle();
        if (vehicle == null) {
            System.out.println("No vehicle found in the spot!");
            return;
        }

        double fee = vehicle.calculate(hourStayed);
        paymentService.processPayment(fee);

        parkingLot.vacateVehicle(spot, vehicle);
        System.out.println("Spot vacated successfully!");
    }
}
