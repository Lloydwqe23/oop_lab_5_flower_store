package com.example;

public class FlowerPack {
    private Flower flower;
    private int count;

    public FlowerPack(Flower new_flower, int number) {
        this.flower = new_flower;
        this.count = number;
    }

    public double getPrice() {
       return flower.getPrice() * count; 
    }
}
