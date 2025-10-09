package com.example;

public class Main {
    private static final double DEFAULT_SEPAL_LENGTH = 5.0;
    private static final double DEFAULT_PRICE = 5.0;
    public static void main(String[] args) {
        Flower flower = new Flower(DEFAULT_SEPAL_LENGTH, DEFAULT_PRICE, FlowerColor.RED, FlowerType.CHAMOMILE);
        FlowerPack firstFlowerPack = new FlowerPack(flower, 10);
        FlowerPack secondFlowerPack = new FlowerPack(flower, 20);
        System.out.println(firstFlowerPack.getPrice());
        System.out.println(secondFlowerPack.getPrice());
    }
}