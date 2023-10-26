package ua.edu.ucu.apps.lab7.flower;

import java.util.ArrayList;
import java.util.Map;

import ua.edu.ucu.apps.lab7.items.Item;

public class FlowerBucket {

    // public FlowerBucket(String description) {
    // super(description);
    // // TODO Auto-generated constructor stub
    // }

    private Flower flower;
    private int quantity;
    private FlowerPack flowerPack;

    public FlowerBucket(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public FlowerBucket(FlowerPack flowerPack, int quantity) {
        this.flowerPack = flowerPack;
        this.quantity = quantity;
    }

    ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public static Flower jsonToFlower(Map<String, Object> json) {
        Flower flower = new Flower((double) json.get("sepal_length"), (double) json.get("price"),
                (FlowerColor) json.get("color"), (FlowerType) json.get("type"));
        return flower;
    }

    public static FlowerPack jsonToFlowerPack(Map<String, Object> json) {
        FlowerPack flowerPack = new FlowerPack((Flower) jsonToFlower((Map<String, Object>) json.get("flower")),
                (int) json.get("quantity"));
        return flowerPack;
    }

    public static FlowerBucket jsonToFlowerBucket(Map<String, Object> json) {
        if (json.get("flower") != null) {
            FlowerBucket flowerBucket = new FlowerBucket(
                    (Flower) jsonToFlower((Map<String, Object>) json.get("flower")),
                    (int) json.get("quantity"));
            return flowerBucket;
        }
        if (json.get("flowerBucket") != null) {
            FlowerBucket flowerBucket = new FlowerBucket(
                    (FlowerPack) jsonToFlowerPack((Map<String, Object>) json.get("flowerPack")),
                    (int) json.get("quantity"));
            return flowerBucket;
        }
        return null;
    }

    // @Override
    // public double price() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'price'");
    // }
}
