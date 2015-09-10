package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnTheNetAmountOfTheItemAsTheGrossAmountWhenTheTaxIsZero() {
        Item item = new Item("Book", 100, 0);

        assertEquals(100, item.computeNetCost(), 0.0);
    }

    @Test
    public void shouldReturnTheNetAmountOfTheItemAs110WhenTheGrossAmountis100AndTax10Percent() {
        Item item = new Item("Chocolate", 100, 10);

        assertEquals(110, item.computeNetCost(), 0.0);
    }

    @Test
    public void shouldReturnTheNetAmountOfTheItemAs115WhenTheGrossAmountIs100AndTheTaxPercentIs15() {
        Item item = new Item("Imported Chocolate", 100, 15);

        assertEquals(115, item.computeNetCost(), 0.0);
    }
}