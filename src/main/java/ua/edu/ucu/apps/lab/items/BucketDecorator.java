package ua.edu.ucu.apps.lab.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BucketDecorator extends AbstractDecorator {
    private Item item;
    private int decotratorPrice = 4;

    public BucketDecorator(Item item) {
        super(item);
        this.item = item;
    }

    public BucketDecorator(String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double price() {
        return decotratorPrice;
    }

    @Override
    public double getPrice() {
        return decotratorPrice + item.price();
    }

}
