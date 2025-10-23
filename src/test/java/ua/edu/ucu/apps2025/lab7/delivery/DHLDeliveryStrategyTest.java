package ua.edu.ucu.apps2025.lab7.delivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DHLDeliveryStrategyTest {

    @Test
    void testMore1500() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        assertEquals(0, delivery.delivery(2000));
    }

    @Test
    void testLess1500() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        assertEquals(200, delivery.delivery(1000));
    }

    @Test
    void test1500() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        assertEquals(200, delivery.delivery(1500));
    }
}