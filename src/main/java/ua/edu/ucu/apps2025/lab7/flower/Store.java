package ua.edu.ucu.apps2025.lab7.flower;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> inventory;
    public Store() {
        this.inventory = new ArrayList<>();
    }

    public void addBucket(FlowerBucket bucket) {
        inventory.add(bucket);
    }

    public List<FlowerBucket> getInventory() {
        return new ArrayList<>(inventory);
    }

    public List<FlowerBucket> search(FlowerColor color, FlowerType flowerType, Double maxPrice) {
        List<FlowerBucket> results = new ArrayList<>();
        for (FlowerBucket bucket : inventory) {
            if (isright(bucket, color, flowerType, maxPrice)) {
                results.add(bucket);
            }
        }
        return results;
    }

    private boolean isright(FlowerBucket bucket, FlowerColor color, 
                                     FlowerType flowerType, Double maxPrice) {

        for (FlowerPack pack : bucket.getFlowerPacks()) {
            Flower flower = pack.getFlower();
            if (color != null && !flower.getColor().equals(color.toString())) {
                continue;
            }
            if (flowerType != null && flower.getFlowerType() != flowerType) {
                continue;
            }
            if (maxPrice != null && flower.getPrice() > maxPrice) {
                continue;
            }
            return true;
        }
        return false;
    }
}