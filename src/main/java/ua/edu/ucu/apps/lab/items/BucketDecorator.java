package ua.edu.ucu.apps.lab.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BucketDecorator extends ItemDecorator {
    private Item item;

    public BucketDecorator(String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return "Bucket Decoration.";
    }

    @Override
    public double price() {
        int price = 4;
        return price;
    }

    public double getPrice() {
        int price = 4;
        return price + item.price();
    }

}
