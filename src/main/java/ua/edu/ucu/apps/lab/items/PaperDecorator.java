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
        int price = 13;
        return price + item.price();
    }

    @Override
    public double price() {
        int price = 13;
        return price;
    }

}
