package system.example.payment;

public class CashPayment implements PaymentStrategy{
    public void processPayment(double amount){
        System.out.println("Process Payment using Cash : " + amount);
    }
}
