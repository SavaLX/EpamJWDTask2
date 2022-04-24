package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class-entity Text with parameter list of paragraphs and code lines
 * */
public class Text implements TextElement {

    /** Field of list of paragraphs and code lines
     *  that are part of sentence */
    private List<TextElement> paragraphsAndCodeLines = new ArrayList<>();

    /**
     * Constructor - creating new object with particular list of paragraphs and code lines
     * @param paragraphsAndCodeLines - list of paragraphs and code lines
     * @see Text#Text()
     * */
    public Text(List<TextElement> paragraphsAndCodeLines) {
        this.paragraphsAndCodeLines = paragraphsAndCodeLines;
    }

    /**
     * Constructor - creating new object without parameters
     * @see Text#Text(List<TextElement>)
     * */
    public Text() {
    }

    /**
     * Method for return the StringBuilder that consist from value
     * of every paragraph and code line
     * @return the value of every paragraph and code line
     * */
    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();

        for (TextElement textElement : paragraphsAndCodeLines) {
            value.append(textElement.getValue()).append("\n");
        }
        return value;
    }

    /** Method for return the list of paragraph and code line of particular text
     * object
     * @return the list of paragraph and code line
     * */
    public List<TextElement> getParagraphsAndCodeLines() {
        return paragraphsAndCodeLines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return paragraphsAndCodeLines.equals(text.paragraphsAndCodeLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphsAndCodeLines);
    }
}
