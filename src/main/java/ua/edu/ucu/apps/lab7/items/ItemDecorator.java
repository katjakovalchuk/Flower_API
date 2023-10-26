package ua.edu.ucu.apps.lab7.items;

public abstract class ItemDecorator extends Item {
    public ItemDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
