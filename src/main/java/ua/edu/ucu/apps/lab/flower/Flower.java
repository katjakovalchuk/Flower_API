package ua.edu.ucu.apps.lab.flower;

import java.util.Map;

// import org.springframework.data.annotation.Id;

// import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
// @Entity
@Getter
public class Flower {
    // @Id
    private FlowerColor color;
    private double price;
    private double sepalLength;
    private FlowerType flowerType;

    public Flower(double sepalLength, double price, FlowerColor color, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.price = price;
        this.color = color;
        this.flowerType = flowerType;
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;

        // this.flowerType = flower.flowerType;
    }

    public static Flower jsonToFlower(Map<String, Object> json) {
        Flower flower = new Flower((double) json.get("sepal_length"), (double) json.get("price"),
                (FlowerColor) json.get("color"), (FlowerType) json.get("type"));
        return flower;

    }

    public String getColor() {
        return this.color.toString();
    }

    public Flower() {
    }
}
