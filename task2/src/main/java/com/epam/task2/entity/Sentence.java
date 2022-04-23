package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence implements TextElement {

    private List<TextElement> words = new ArrayList<>();

    public Sentence(List<TextElement> words) {
        this.words = words;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return words.equals(sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
