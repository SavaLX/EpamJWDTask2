package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paragraph implements TextElement {
    private List<TextElement> sentences = new ArrayList<>();

    public Paragraph(List<TextElement> sentences) {
        this.sentences = sentences;
    }

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

    public List<TextElement> getSentences() {
        return sentences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paragraph)) return false;
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(sentences, paragraph.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences);
    }
}
