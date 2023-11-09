package ua.edu.ucu.apps.lab.flower;

import java.util.Map;

import lombok.Getter;

public class FlowerPack {
    private Flower flower;
    @Getter
    private int quantity = 1;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.setQuantity(quantity);
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    };}

//     public static FlowerPack jsonToFlowerpack(Map<String, Object> json) {
//         FlowerPack flowerPack = new FlowerPack(
//             (Flower) Flower.jsonToFlower((Map<String, Object>)
//             json.get("flower")),
//             (int) json.get("quantity"));
//         return flowerPack;
//     }
// }
