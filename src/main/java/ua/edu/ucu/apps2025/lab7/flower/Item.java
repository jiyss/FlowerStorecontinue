package ua.edu.ucu.apps2025.lab7.flower;

import lombok.Data;

@Data
public class Item {
    private FlowerBucket flowerBucket;

    double getPrice(){
        return flowerBucket.getPrice();
    }
}