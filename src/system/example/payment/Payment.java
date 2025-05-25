package system.example.payment;

public class Payment {
    double amount;
    PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy, double amount) {
        this.paymentStrategy = paymentStrategy;
        this.amount = amount;
    }

    public void processPayment() {
        if(amount > 0){
            this.paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

}
