package ua.edu.ucu.apps.lab.items;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
public class BucketDecorator extends AbstractDecorator {
    private Item item;
    private int decotratorPrice = 4;

    public BucketDecorator(String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return "Bucket Decoration.";
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
