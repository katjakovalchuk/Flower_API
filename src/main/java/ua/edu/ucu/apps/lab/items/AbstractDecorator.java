package ua.edu.ucu.apps.lab.items;

public abstract class AbstractDecorator extends Item {
    private int decoratorPrice;

    public AbstractDecorator(Item itemSecond) {
        super(itemSecond.toString());
        // TODO Auto-generated constructor stub
    }

    public AbstractDecorator(String itemSecond) {
        super(itemSecond);
        // TODO Auto-generated constructor stub
    }

    public abstract double getPrice();
}
