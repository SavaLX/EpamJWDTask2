package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class-entity paragraph with parameter list of sentence
 * */
public class Paragraph implements TextElement {

    /** Field of list of sentences that are part of paragraph */
    private List<TextElement> sentences = new ArrayList<>();

    /**
     * Constructor - creating new object with particular list of sentences
     * @param sentences - list of sentences
     * @see Paragraph#Paragraph()
     * */
    public Paragraph(List<TextElement> sentences) {
        this.sentences = sentences;
    }

    /**
     * Constructor - creating new object without parameters
     * @see Paragraph#Paragraph(List<TextElement>)
     * */
    public Paragraph() {
    }

    /**
     * Method for return the StringBuilder that consist from value
     * of every sentence in paragraph
     * @return the value of every sentence that is a part of paragraph
     * */
    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();
        for (TextElement textElement : sentences) {
            value.append(textElement.getValue());
        }
        return value;
    }

    /** Method for return the list of sentence of particular paragraph
     * object
     * @return the list of sentence
     * */
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
