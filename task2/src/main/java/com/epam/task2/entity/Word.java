package com.epam.task2.entity;

public class Word implements TextElement {

    StringBuilder value;

    @Override
    public StringBuilder getValue() {
        System.out.printf("Word");
        return value;
    }

    @Override
    public void addElement(TextElement textElement) {
        throw new UnsupportedOperationException();
    }
}
