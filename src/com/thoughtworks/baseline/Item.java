package com.thoughtworks.baseline;

public class Item {
    private String nameOfTheItem;
    private double grossCost;
    private double taxPercentageOnTheItem;

    public Item(String nameOfTheItem, double grossCost, double taxPercentageOnTheItem) {
        this.nameOfTheItem = nameOfTheItem;
        this.grossCost = grossCost;
        this.taxPercentageOnTheItem = taxPercentageOnTheItem;
    }

    public double computeNetCost() {
        double taxOnItem = this.grossCost * this.taxPercentageOnTheItem / 100;
        double netAmount = taxOnItem + this.grossCost;
        return netAmount;
    }
}
