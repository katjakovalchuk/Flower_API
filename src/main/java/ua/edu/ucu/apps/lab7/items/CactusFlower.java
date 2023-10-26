package ua.edu.ucu.apps.lab7.items;

public class CactusFlower extends Item {

    public CactusFlower(String description) {
        super(description);
    }

    @Override
    public double price() {
        return 35;
    }

    @Override
    public String toString() {
        return this.getDescription() + ".";
    }

}
