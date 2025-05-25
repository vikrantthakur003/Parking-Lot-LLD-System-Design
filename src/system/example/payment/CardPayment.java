package system.example.payment;

public class CardPayment implements PaymentStrategy{

    public void processPayment(double amount) {
        System.out.println("Process Payment using Card : " + amount);
    }
}
