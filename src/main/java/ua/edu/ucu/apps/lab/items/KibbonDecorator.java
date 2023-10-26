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
        int price = 40;
        return price;
    }

    @Override
    public String getDescription() {
        return "Kibbon Decoration.";
    }

    public double getPrice() {
        int price = 40;
        return price + item.price();
    }
}
