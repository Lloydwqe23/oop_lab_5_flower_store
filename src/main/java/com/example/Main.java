package com.example;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(5, 5, FlowerColor.RED, FlowerType.CHAMOMILE);
        FlowerPack flowerPack1 = new FlowerPack(flower, 10);
        FlowerPack flowerPack2 = new FlowerPack(flower, 20);
        System.out.println(flowerPack1.getPrice());
        System.out.println(flowerPack2.getPrice());
    }
}