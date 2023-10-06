package task3;

public class PaymentProcess {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 800.0, 2);
        Product product2 = new Product("Smartphone", 400.0, 3);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalPayment = new Kaspi("example@email.com");

        System.out.println("Total Price: $" + cart.calculateTotalPrice());

        cart.checkout(creditCardPayment);
        cart.checkout(payPalPayment);
    }
}
