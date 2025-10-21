package ua.edu.ucu.apps2025.lab7.flower;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    private FlowerColor color;
    protected double sepalLength;
    protected double price;
    private FlowerType flowerType;
    
    public Flower(Flower other) {
        this.color = other.color;
        this.flowerType= other.flowerType;
        this.sepalLength = other.sepalLength;
        this.price = other.price;
    }

    public String getColor() {
        return color.toString();
    }
}
