package ua.edu.ucu.apps.lab.flower;

public class Tulip extends Flower {

    private double sepalLength;
    private double price;
    private FlowerColor color;

    public Tulip(Tulip tulip) {
        this.sepalLength = tulip.sepalLength;
        this.price = tulip.price;
        this.color = tulip.color;
    }
}
