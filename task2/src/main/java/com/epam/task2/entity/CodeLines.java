package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class CodeLines implements TextElement {

    List<TextElement> codeBlocks = new ArrayList<>();

    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();
        for (TextElement textElement : codeBlocks) {
            value.append(textElement.getValue());
        }
        return value;
    }

    @Override
    public void addElement(TextElement textElement) {
        codeBlocks.add(textElement);
    }
}
