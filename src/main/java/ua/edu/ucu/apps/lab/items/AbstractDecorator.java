package ua.edu.ucu.apps.lab.items;

public abstract class AbstractDecorator extends Item {

    public AbstractDecorator(Item itemSecond) {
        super(itemSecond.getDescription());
    }

    public AbstractDecorator(String itemSecond) {
        super(itemSecond);
    }

    public String getDescription() {
        return super.getDescription();
    }

    public abstract double getPrice();
}
