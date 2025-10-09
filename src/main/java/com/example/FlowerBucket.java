package com.example;
import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack newPack) {
        flowerPacks.add(newPack);
    }
    public double price() {
        double totalSum = 0;
        for(FlowerPack ourPack: flowerPacks) {
            totalSum += ourPack.getPrice();
        }
        return totalSum;
    }
}
