package ua.edu.ucu.apps2025.lab7.delivery;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public double delivery(double orderPrice) {
        System.out.println("Postal Delivery");
        if (orderPrice > 1000) {
            return 0;
        }
        return 100;
    }
}
