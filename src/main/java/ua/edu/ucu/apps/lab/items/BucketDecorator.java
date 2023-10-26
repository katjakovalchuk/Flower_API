package ua.edu.ucu.apps.lab.items;

public class BucketDecorator extends ItemDecorator {

    public BucketDecorator(String description) {
        super(description);
    }

    public Item item;

    @Override
    public String getDescription() {
        return "Bucket Decoration.";
    }

    @Override
    public double price() {
        return 4;
    }

    public double getPrice() {
        return 4 + item.price();
    }

}
