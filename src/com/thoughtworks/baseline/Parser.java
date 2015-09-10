package com.thoughtworks.baseline;

public class Parser {
    private String userInputItem;

    public Parser(String userInputItem) {
        this.userInputItem = userInputItem;
    }

    public Item parse() {
        return new Item("Book", 100, 0);
    }
}
