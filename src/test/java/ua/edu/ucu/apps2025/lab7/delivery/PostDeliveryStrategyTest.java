package ua.edu.ucu.apps2025.lab7.delivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostDeliveryStrategyTest {

    @Test
    void testMore1000() {
        PostDeliveryStrategy delivery = new PostDeliveryStrategy();
        assertEquals(0, delivery.delivery(1500));
    }

    @Test
    void testLess1000() {
        PostDeliveryStrategy delivery = new PostDeliveryStrategy();
        assertEquals(100, delivery.delivery(500));
    }

    @Test
    void test1000() {
        PostDeliveryStrategy delivery = new PostDeliveryStrategy();
        assertEquals(100, delivery.delivery(1000));
    }
}