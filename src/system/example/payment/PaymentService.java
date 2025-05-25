package system.example.payment;

import java.util.Scanner;

public class PaymentService {
    Scanner scanner;

    public PaymentService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void processPayment(double fee){
        choosePaymentMethod(fee);
    }

    public void choosePaymentMethod(double fee){
        System.out.println("Total Fee : " + fee);
        System.out.println("Please enter your payment method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        System.out.println("3. UPI");

       int choice = scanner.nextInt();

       Payment payment;
       switch (choice) {
           case 1:
               payment = new Payment(new CardPayment(), fee);
               break;
           case 2:
               payment = new Payment(new CashPayment(), fee);
                break;
           case 3:
               payment = new Payment(new UpiPayment(), fee);
               break;
           default:
               System.out.println("Invalid choice, we will proceed with cash payment");
               payment = new Payment(new CashPayment(), fee);
               break;
       }
       payment.processPayment();
    }
}
