package com.example;

public class FlowerPack {
    private final Flower flower;
    private final int count;

    public FlowerPack(Flower newFlower, int number) {
        this.flower = newFlower;
        this.count = number;
    }

    public double getPrice() {
       return flower.getPrice() * count; 
    }
}
