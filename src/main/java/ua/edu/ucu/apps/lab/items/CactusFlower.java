package ua.edu.ucu.apps.lab.items;

public class CactusFlower extends Item {

    public CactusFlower(String description) {
        super(description);
    }

    @Override
    public double price() {
        int PRICE = 35;
        return PRICE;
    }

    @Override
    public String toString() {
        return this.getDescription() + ".";
    }

}
