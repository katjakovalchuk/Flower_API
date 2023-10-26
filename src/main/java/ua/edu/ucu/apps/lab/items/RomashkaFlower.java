package ua.edu.ucu.apps.lab.items;

public class RomashkaFlower extends Item {

    public RomashkaFlower(String description) {
        super(description);
    }

    @Override
    public double price() {
        int PRICE = 25;
        return PRICE;
    }

    @Override
    public String toString() {
        return this.getDescription() + ".";
    }

}
