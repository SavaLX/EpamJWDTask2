package com.epam.task2.entity;

import java.util.Objects;

/**
 * Class-entity word with parameter "value"
 */
public class Word implements TextElement {

    /** Field value of word */
    private StringBuilder value;

    /**Constructor - creating new object with particular value
     * @param value - value of word
     * @see Word#Word()
     * */
    public Word(StringBuilder value) {
        this.value = value;
    }

    /** Constructor - creating new object without parameters
     * @see Word#Word()(StringBuilder)
     * */
    public Word() {
    }

    /**
     * This method are overriding from interface TextElement
     * for return value of object
     * @return the value of word object
     * */
    @Override
    public StringBuilder getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word = (Word) o;
        return getValue().equals(word.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "Word{" +
                "value=" + value +
                '}';
    }
}
