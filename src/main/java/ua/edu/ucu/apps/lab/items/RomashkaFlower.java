package ua.edu.ucu.apps.lab.items;

public class RomashkaFlower extends Item {

    public RomashkaFlower(String description) {
        super(description);
    }

    @Override
    public double price() {
        int price = 25;
        return price;
    }

    @Override
    public String toString() {
        return this.getDescription() + ".";
    }

}
