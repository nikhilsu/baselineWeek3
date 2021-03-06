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
        if (object == null || object.getClass() != this.getClass())
            return false;
        Item that = (Item) object;
        if (this.nameOfTheItem.equals(that.nameOfTheItem) && this.grossCost == that.grossCost && this.taxPercentageOnTheItem == that.taxPercentageOnTheItem)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameOfTheItem != null ? nameOfTheItem.hashCode() : 0;
        temp = Double.doubleToLongBits(grossCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(taxPercentageOnTheItem);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
