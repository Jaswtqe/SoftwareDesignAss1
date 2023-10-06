package task3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems = new ArrayList<>();

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : cartItems) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        double totalPrice = calculateTotalPrice();
        paymentStrategy.processPayment(totalPrice);
    }
}
