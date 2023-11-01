package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab.payment.PayPalCreditStrategy;

import org.junit.jupiter.api.Assertions;

public class PaymentTest {

    @Test
    public void testPapyPal() {
        PayPalCreditStrategy payPalCreditStrategy = new PayPalCreditStrategy();
        double price = 50;
        String paymentResult = payPalCreditStrategy.pay(price);
        Assertions.assertEquals("Pay by Pay Pal: 50.0", paymentResult);
    }

    @Test
    public void testCreditCard() {
        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        double price = 50;
        String paymentResult = creditCardPaymentStrategy.pay(price);
        Assertions.assertEquals("Pay by Credit Card: 50.0", paymentResult);
    }
}
