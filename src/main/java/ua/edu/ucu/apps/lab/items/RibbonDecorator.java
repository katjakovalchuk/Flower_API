package ua.edu.ucu.apps.lab.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab.flower.Flower;
import ua.edu.ucu.apps.lab.flower.FlowerBucket;

@Getter
@Setter
@AllArgsConstructor
public class RibbonDecorator extends AbstractDecorator{
    private Item item;
    private int decoratorPrice = 40;
    public RibbonDecorator(org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item item2) {
        super(item2);
    }

    @Override
    public double price() {
        return decoratorPrice;
    }

    @Override
    public String getDescription() {
        return "Kibbon Decoration.";
    }

    public double getPrice() {
        return decoratorPrice + item.price();
    }

    public RibbonDecorator(FlowerBucket item2) {
    }
}
