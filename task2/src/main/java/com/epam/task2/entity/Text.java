package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class Text implements TextElement {
    private List<TextElement> paragraphsAndCodeBlocks = new ArrayList<>();

    public Text(){
    }

    public Text(List<TextElement> paragraphsAndCodeBlocks) {
        this.paragraphsAndCodeBlocks = paragraphsAndCodeBlocks;
    }

    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();

        for (TextElement textElement : paragraphsAndCodeBlocks) {
            value.append(textElement.getValue()).append("\n");
        }
        return value;
    }

    @Override
    public void addElement(TextElement textElement) {
        paragraphsAndCodeBlocks.add(textElement);
    }
}
