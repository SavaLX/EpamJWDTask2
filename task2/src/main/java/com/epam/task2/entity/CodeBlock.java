package com.epam.task2.entity;

import java.util.Objects;

public class CodeBlock implements TextElement {

    private StringBuilder value;

    public CodeBlock(StringBuilder value) {
        this.value = value;
    }

    public CodeBlock() {
    }

    @Override
    public StringBuilder getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodeBlock)) return false;
        CodeBlock codeBlock = (CodeBlock) o;
        return Objects.equals(getValue(), codeBlock.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "CodeBlock{" +
                "value=" + value +
                '}';
    }
}
