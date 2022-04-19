package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements TextElement {
    private List<TextElement> sentences = new ArrayList<>();

    public Paragraph() {
    }

    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();
        for (TextElement textElement : sentences) {
            value.append(textElement.getValue());
        }
        return value;
    }

    @Override
    public void addElement(TextElement textElement) {
        sentences.add(textElement);
    }
}
