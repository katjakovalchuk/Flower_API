package ua.edu.ucu.apps.lab.flower;

public class Chamomile extends Flower {

    private double sepalLength;
    private double price;
    private FlowerColor color;

    public Chamomile(Chamomile chamomile) {
        this.sepalLength = chamomile.sepalLength;
        this.price = chamomile.price;
        this.color = chamomile.color;
    }

}
