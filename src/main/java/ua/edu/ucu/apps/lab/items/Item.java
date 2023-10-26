package ua.edu.ucu.apps.lab.items;

public abstract class Item {
    private String description;

    public Item(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
