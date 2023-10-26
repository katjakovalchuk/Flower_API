package ua.edu.ucu.apps.lab.flower;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    private Flower flower;
    @Getter
    @Setter
    private int quantity = 1;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.setQuantity(quantity);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity <= 0
            ? 1
            : quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    };

    public static FlowerPack jsonToFlowerpack(Map<String, Object> json) {
        FlowerPack flowerPack = new FlowerPack((Flower) 
            Flower.jsonToFlower((Map<String, Object>) json.get("flower")),
            (int) json.get("quantity"));
        return flowerPack;
    }
}
