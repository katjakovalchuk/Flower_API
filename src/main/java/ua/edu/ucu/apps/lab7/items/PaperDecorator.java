package ua.edu.ucu.apps.lab7.items;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(String description) {
        super(description);
    }

    public Item item;

    @Override
    public String getDescription() {
        return "Paper Decor for Flowers.";
    }

    public double getPrice() {
        return 13 + item.price();
    }

    @Override
    public double price() {
        return 13;
    }

}
