package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter @AllArgsConstructor
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;
}
