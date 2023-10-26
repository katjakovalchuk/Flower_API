package ua.edu.ucu.apps.lab.flower;

import java.util.ArrayList;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerBucket {

    private Flower flower;
    private int quantity;
    private FlowerPack flowerPack;
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public FlowerBucket(FlowerPack flowerPac, int quantity) {
        this.flowerPack = flowerPac;
        this.quantity = quantity;
    }

    public void addFlowerPack(FlowerPack flowerPac) {
        flowerPacks.add(flowerPac);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPac) {
        flowerPacks.add(flowerPac);
    }

    public static Flower jsonToFlower(Map<String, Object> json) {
        Flower flower = new Flower((double) json.get("sepal_length"),
            (double) json.get("price"),
            (FlowerColor) json.get("color"),
            (FlowerType) json.get("type"));
        return flower;
    }

    public static FlowerPack jsonToFlowerPack(Map<String, Object> json) {
        FlowerPack flowerPack = new FlowerPack(
        (Flower) jsonToFlower((Map<String, Object>)
        json.get("flower")),
        (int) json.get("quantity"));
        return flowerPack;
    }

    public static FlowerBucket jsonToFlowerBucket(Map<String, Object> json) {
        if (json.get("flower") != null) {
            FlowerBucket flowerBucket = new FlowerBucket(
                    (Flower) jsonToFlower(
                    (Map<String, Object>) json.get("flower")),
                    (int) json.get("quantity"));
            return flowerBucket;
        }
        if (json.get("flowerBucket") != null) {
            FlowerBucket flowerBucket = new FlowerBucket(
                    (FlowerPack) jsonToFlowerPack(
                    (Map<String, Object>) json.get("flowerPack")),
                    (int) json.get("quantity"));
            return flowerBucket;
        }
        return null;
    }

}
