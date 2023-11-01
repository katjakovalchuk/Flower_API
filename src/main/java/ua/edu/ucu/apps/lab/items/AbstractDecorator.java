package ua.edu.ucu.apps.lab.items;

import lombok.AllArgsConstructor;

public abstract class AbstractDecorator extends Item {
    private int decoratorPrice;

    public AbstractDecorator(String description) {
        super(description);
        // TODO Auto-generated constructor stub
    }

    public abstract double getPrice();
}
