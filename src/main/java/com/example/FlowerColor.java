package com.example;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private final String hexColor;
    FlowerColor(String hexColor) {
        this.hexColor = hexColor;
    }

    public String getHexColor() {
        return hexColor;
    }
}
