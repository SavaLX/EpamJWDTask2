package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text implements TextElement {
    private List<TextElement> paragraphsAndCodeBlocks = new ArrayList<>();

    public Text(List<TextElement> paragraphsAndCodeBlocks) {
        this.paragraphsAndCodeBlocks = paragraphsAndCodeBlocks;
    }

    public Text() {
    }

    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();

        for (TextElement textElement : paragraphsAndCodeBlocks) {
            value.append(textElement.getValue()).append("\n");
        }
        return value;
    }

    public List<TextElement> getParagraphsAndCodeBlocks() {
        return paragraphsAndCodeBlocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return paragraphsAndCodeBlocks.equals(text.paragraphsAndCodeBlocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphsAndCodeBlocks);
    }
}
