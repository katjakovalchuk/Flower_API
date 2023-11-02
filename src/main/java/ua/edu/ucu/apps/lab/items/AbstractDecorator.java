package ua.edu.ucu.apps.lab.items;

import lombok.AllArgsConstructor;

public abstract class AbstractDecorator extends Item {
    private int decoratorPrice;

    public AbstractDecorator(Item item2) {
        super(item2.toString());
        // TODO Auto-generated constructor stub
    }

    public AbstractDecorator(String item2) {
        super(item2);
        // TODO Auto-generated constructor stub
    }

    public abstract double getPrice();
}
