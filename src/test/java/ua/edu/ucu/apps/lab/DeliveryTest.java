package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab.items.CactusFlower;
import ua.edu.ucu.apps.lab.items.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

public class DeliveryTest {

    private final ByteArrayOutputStream outContent
         = new ByteArrayOutputStream();
    private final PrintStream originalOut 
        = System.out;

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
        DHLDeliveryStrategy dHLstrategy = 
            new DHLDeliveryStrategy();
        Item item = 
            new CactusFlower("cactus");
        dHLstrategy.deliver(item);
        Assertions.assertEquals("Deliver by DHL: cactus.\r\n",
             outContent.toString());
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDeliveryStrategy = 
            new PostDeliveryStrategy();
        Item item = 
            new CactusFlower("cactus");
        postDeliveryStrategy.deliver(item);
        Assertions.assertEquals("Deliver by Post: cactus.\r\n",
             outContent.toString());
    }
}
