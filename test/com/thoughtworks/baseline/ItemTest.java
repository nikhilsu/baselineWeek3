package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnTheNetAmountOfTheItemAsTheGrossAmountWhenTheTaxIsZero() {
        Item item = new Item("Book", 100);

        assertEquals(100, item.computeNetCost(), 0.0);
    }

}