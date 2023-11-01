package ua.edu.ucu.apps.lab.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab.flower.FlowerBucket;

@Getter
@Setter
@AllArgsConstructor
public class PaperDecorator extends AbstractDecorator {
    private Item item;
    private int decoratorPrice = 13;

    public PaperDecorator(org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item item2) {
        super(item2);
    }

    @Override
    public String getDescription() {
        return "Paper Decor for Flowers.";
    }

    @Override
    public double getPrice() {
        return decoratorPrice + item.price();
    }

    @Override
    public double price() {
        return decoratorPrice;
    }

    public PaperDecorator(FlowerBucket item2) {
    }

}
