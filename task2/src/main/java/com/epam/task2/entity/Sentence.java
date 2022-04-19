package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements TextElement {

    private List<TextElement> words = new ArrayList<>();

    public Sentence() {
    }

    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();
        for (TextElement textElement : words) {
            value.append(textElement.getValue());
        }
        return value;
    }

    @Override
    public void addElement(TextElement textElement) {
        words.add(textElement);
    }
}
