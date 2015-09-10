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

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        Item that = (Item) object;
        if (this.nameOfTheItem.equals(that.nameOfTheItem) && this.grossCost == that.grossCost && this.taxPercentageOnTheItem == that.taxPercentageOnTheItem)
            return true;
        else
            return false;
    }
}
