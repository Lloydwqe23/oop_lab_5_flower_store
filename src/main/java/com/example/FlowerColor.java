package com.example;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private String HexColor;
    FlowerColor(String hexColor){
        this.HexColor = hexColor;
    }
}
