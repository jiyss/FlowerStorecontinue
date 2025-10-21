package ua.edu.ucu.apps2025.lab7.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Payment was successfully done by paypal, sum " + price);
    }
}
