package com.epam.task2.entity;

public class Word implements TextElement {

    private StringBuilder value;

    public Word(StringBuilder value) {
        this.value = value;
    }

    public Word() {
    }

    @Override
    public StringBuilder getValue() {
        return value;
    }

    public void setValue(StringBuilder value) {
        this.value = value;
    }

}
