package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class CodeBlock implements TextElement{

    StringBuilder value;

    @Override
    public StringBuilder getValue() {
        return value;
    }

    @Override
    public void addElement(TextElement textElement) {
        throw new UnsupportedOperationException();
    }
}
