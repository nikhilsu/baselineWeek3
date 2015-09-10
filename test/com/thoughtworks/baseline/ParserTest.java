package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnAnItemOfTypeItem() {
        Parser parser = new Parser("1 Book at 100");
        Item item = new Item("Book", 100, 0);

        assertEquals(item.getClass(), parser.parse().getClass());
    }
}