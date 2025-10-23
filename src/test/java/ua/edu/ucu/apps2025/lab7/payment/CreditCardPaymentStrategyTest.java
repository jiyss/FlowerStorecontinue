package ua.edu.ucu.apps2025.lab7.payment;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CreditCardPaymentStrategyTest {

    @Test
    void testPayWithPositive() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        assertDoesNotThrow(() -> payment.pay(67.0));
    }

    @Test
    void testPayWith0() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        assertThrows(IllegalArgumentException.class, () -> payment.pay(0));
    }

    @Test
    void testPayWithNegative() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        assertThrows(IllegalArgumentException.class, () -> payment.pay(-67));
    }
}