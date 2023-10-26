package ua.edu.ucu.apps.lab.items;

public abstract class ItemDecorator extends Item {
    public ItemDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
