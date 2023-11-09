package ua.edu.ucu.apps.lab.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RibbonDecorator extends AbstractDecorator {
    private Item item;
    private int decoratorPrice = 40;

    public RibbonDecorator(Item itemSecond) {
        super(itemSecond);
    }

    @Override
    public double price() {
        return decoratorPrice;
    }

    @Override
    public String getDescription() {
        return "Ribbon Decoration.";
    }

    public double getPrice() {
        return decoratorPrice + item.price();
    }

}
