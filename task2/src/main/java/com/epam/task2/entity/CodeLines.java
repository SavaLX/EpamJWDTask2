package com.epam.task2.entity;

import java.util.Objects;

/**
 * Class-entity code lines with parameter "value"
 */
public class CodeLines implements TextElement {
    /** Field value of code line */
    private StringBuilder value;

    /**Constructor - creating new object with particular value
     * @param value - value of code line
     * @see CodeLines#CodeLines()
     * */
    public CodeLines(StringBuilder value) {
        this.value = value;
    }

    /** Constructor - creating new object without parameters
     * @see CodeLines#CodeLines(StringBuilder)
     * */
    public CodeLines() {
    }

    /**
     * This method are overriding from interface TextElement
     * for return value of object
     * @return the value of CodeLine object
     * */
    @Override
    public StringBuilder getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodeLines)) return false;
        CodeLines codeLines = (CodeLines) o;
        return Objects.equals(getValue(), codeLines.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "CodeLines{" +
                "value=" + value +
                '}';
    }
}
