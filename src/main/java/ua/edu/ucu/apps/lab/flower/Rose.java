package ua.edu.ucu.apps.lab.flower;

public class Rose extends Flower {
    private double sepalLength;
    private double price;
    private FlowerColor color;

    public Rose() {
    }

    public Rose(Rose rose) {
        this.sepalLength = rose.sepalLength;
        this.price = rose.price;
        this.color = rose.color;
    }
    // super(5.0, 60.0, rose, Rose);
}
