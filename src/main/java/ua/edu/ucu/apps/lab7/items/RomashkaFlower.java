package ua.edu.ucu.apps.lab7.items;

public class RomashkaFlower extends Item {

    public RomashkaFlower(String description) {
        super(description);
    }

    @Override
    public double price() {
        return 25;
    }

    @Override
    public String toString() {
        return this.getDescription() + ".";
    }

}
