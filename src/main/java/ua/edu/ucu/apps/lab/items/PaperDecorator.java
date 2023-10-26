package ua.edu.ucu.apps.lab.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaperDecorator extends ItemDecorator {
    private Item item;

    public PaperDecorator(String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return "Paper Decor for Flowers.";
    }

    public double getPrice() {
        int PRICE = 13;
        return PRICE + item.price();
    }

    @Override
    public double price() {
        int PRICE = 13;
        return PRICE;
    }

}
