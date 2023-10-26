package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab7.items.CactusFlower;
import ua.edu.ucu.apps.lab7.items.Item;

public class DeliveryTest {

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
        DHLDeliveryStrategy DHLstrategy = new DHLDeliveryStrategy();
        Item item = new CactusFlower("cactus");
        DHLstrategy.deliver(item);
        Assertions.assertEquals("Deliver by DHL: cactus.\r\n", outContent.toString());
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
        Item item = new CactusFlower("cactus");
        postDeliveryStrategy.deliver(item);
        Assertions.assertEquals("Deliver by Post: cactus.\r\n", outContent.toString());
    }
}
