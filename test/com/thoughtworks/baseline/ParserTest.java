package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnAnItemOfTypeItem() {
        Parser parser = new Parser("1 book at 100");
        Item item = new Item("book", 100, 0);

        assertEquals(item.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldreturnAnItemWhichHasTaxPercent0WhenTheUserPurchasesNonTaxableItems() {
        Parser parser = new Parser("1 book at 100");
        Item item = new Item("book", 100, 0);

        assertEquals(item, parser.parse());
    }
}