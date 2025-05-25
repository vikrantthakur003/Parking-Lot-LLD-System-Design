import system.example.gates.EntranceGate;
import system.example.gates.ExitGate;
import system.example.parkinglot.ParkingFloor;
import system.example.parkinglot.ParkingLot;
import system.example.payment.PaymentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ParkingFloor floor = new ParkingFloor(3, 4, 1);
        List<ParkingFloor> parkingFloors = new ArrayList<>();

        parkingFloors.add(floor);

        ParkingLot parkingLot = new ParkingLot(parkingFloors);

        PaymentService paymentService = new PaymentService(scanner);

        EntranceGate entranceGate = new EntranceGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot, paymentService);

        // Start of the parking lot system
        System.out.println("\n=========================================");
        System.out.println("   Welcome to the Parking Lot System!   ");
        System.out.println("=========================================");

        boolean exit = false;
        while (!exit) {
            showMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    entranceGate.processEntrance();
                    break;
                case 2:
                    System.out.println("Enter spot number to vacate");
                    int spotNumber = scanner.nextInt();

                    System.out.println("Enter the number of hours the vehicle stayed : ");
                    int hours = scanner.nextInt();
                    exitGate.exit(spotNumber, hours);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Thank you for using Parking Lot!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    public static void showMenu(){
        System.out.println("Please choose an option from below:");
        System.out.println("1. Park a vehicle");
        System.out.println("2. Vacate a vehicle spot");
        System.out.println("3. Exit System");

    }
}