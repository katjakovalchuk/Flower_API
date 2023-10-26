package ua.edu.ucu.apps.lab.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KibbonDecorator extends ItemDecorator {
    private Item item;

    public KibbonDecorator(String description) {
        super(description);
    }

    @Override
    public double price() {
        int PRICE = 40;
        return PRICE;
    }

    @Override
    public String getDescription() {
        return "Kibbon Decoration.";
    }

    public double getPrice() {
        int PRICE = 40;
        return PRICE + item.price();
    }
}
