package ua.edu.ucu.apps.lab;

import java.util.Random;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.flower.Flower;
import ua.edu.ucu.apps.lab.flower.FlowerBucket;
import ua.edu.ucu.apps.lab.items.PaperDecorator;
import ua.edu.ucu.apps.lab.items.RibbonDecorator;

public class DecoratorsTest {
    private static Random random = new Random();
    private static int max_quantity = 100;
    private static int max_price = 100;

    @Test
    public void testPrice() {
        int price = random.nextInt(max_price);
        int quantity = random.nextInt(max_quantity);
        Flower flower = new Flower();
        flower.setPrice(price);

        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerBucket item = flowerBucket;
        RibbonDecorator ribDecor = new RibbonDecorator(item);
        PaperDecorator papDecor = new PaperDecorator(item);

        Assertions.assertThat(ribDecor.getPrice() >= price * quantity);
        Assertions.assertThat(papDecor.getPrice() >= price * quantity);
    }
}
