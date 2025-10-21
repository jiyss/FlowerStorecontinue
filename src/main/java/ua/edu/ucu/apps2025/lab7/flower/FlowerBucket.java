package ua.edu.ucu.apps2025.lab7.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return flowerPacks.stream()
            .mapToDouble(pack -> pack.getPrice())
            .sum();
    }

    public List<FlowerPack> getFlowerPacks() {
        return new ArrayList<>(flowerPacks);
    }
}