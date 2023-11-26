package ua.edu.ucu.apps.lab.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaperDecorator extends AbstractDecorator {
    private Item item;
    private int decoratorPrice = 13;

    public PaperDecorator(Item item) {
        super(item);
        this.item = item;
    }

    public PaperDecorator(String description) {
        super(description);
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

}
