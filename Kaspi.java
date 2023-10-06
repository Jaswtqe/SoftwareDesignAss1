package task3;

public class Kaspi implements PaymentStrategy {
    private String email;

    public Kaspi(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}