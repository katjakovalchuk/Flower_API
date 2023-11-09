package ua.edu.ucu.apps.lab.flower;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Entity
@Getter
public class Flower {
    @Id
    private int id;
    private FlowerColor color;
    private double price;
    private double sepalLength;
    private FlowerType flowerType;

    public Flower(double sepalLength, double price,
            FlowerColor color) {
        this.sepalLength = sepalLength;
        this.price = price;
        this.color = color;
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;

        // this.flowerType = flower.flowerType;
    }

    public static Flower jsonToFlower(Map<String, Object> json) {
        Flower flower = new Flower(
                ((Number) json.get("sepalLength")).doubleValue(),
                ((Number) json.get("price")).doubleValue(),
                FlowerColor.toFlowerColor( (String) json.get("color")));
        return flower;

    }

    public String getColor() {
        return this.color.toString();
    }

    public Flower() {
    }
}
