package system.example.payment;

public class UpiPayment implements PaymentStrategy{
    public void processPayment(double amount){
        System.out.println("Process Payment using UPI : " + amount);
    }
}
