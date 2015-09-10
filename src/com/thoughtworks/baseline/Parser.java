package com.thoughtworks.baseline;

public class Parser {
    private String userInputItem;

    public Parser(String userInputItem) {
        this.userInputItem = userInputItem;
    }

    public Item parse() {
        if (userInputItem.contains(" book ") || userInputItem.contains(" chocolate ") || userInputItem.contains(" headache pills "))
            return new Item(userInputItem.split(" ")[1], 100, 0);
        else
            return new Item("book", 100, 0);
    }
}
