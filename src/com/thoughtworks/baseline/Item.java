package com.thoughtworks.baseline;

public class Item {
    private String nameOfTheItem;
    private double grossCost;

    public Item(String nameOfTheItem, double grossCost) {
        this.nameOfTheItem = nameOfTheItem;
        this.grossCost = grossCost;
    }

    public double computeNetCost() {
        return 100;
    }
}
