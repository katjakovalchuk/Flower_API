package ua.edu.ucu.apps.lab7.items;

public class KibbonDecorator extends ItemDecorator {

    public KibbonDecorator(String description) {
        super(description);
    }

    public Item item;

    @Override
    public double price() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Kibbon Decoration.";
    }

    public double getPrice() {
        return 40 + item.price();
    }
}
