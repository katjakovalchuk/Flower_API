package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab.payment.PayPalCreditStrategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

public class PaymentTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testDHLDelivery() {
        PayPalCreditStrategy PayPalCreditStrategystrategy = new PayPalCreditStrategy();
        PayPalCreditStrategystrategy.pay(50);
        Assertions.assertEquals("Pay by Pay Pal: 50.0\r\n", outContent.toString());
    }

    @Test
    public void testPostDelivery() {
        CreditCardPaymentStrategy CreditCardPaymentStrategyStrategy = new CreditCardPaymentStrategy();
        CreditCardPaymentStrategyStrategy.pay(50);
        Assertions.assertEquals("Pay by Credit Card: 50.0\r\n", outContent.toString());
    }
}
