package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class-entity sentence with parameter list of word
 * */
public class Sentence implements TextElement {

    /** Field of list of words that are part of sentence */
    private List<TextElement> words = new ArrayList<>();

    /**
     * Constructor - creating new object with particular list of words
     * @param words - list of words
     * @see Sentence#Sentence()
     * */
    public Sentence(List<TextElement> words) {
        this.words = words;
    }

    /**
     * Constructor - creating new object without parameters
     * @see Sentence#Sentence(List<TextElement>)
     * */
    public Sentence() {
    }

    /**
     * Method for return the StringBuilder that consist from value
     * of every word in sentence
     * @return the value of every word that is a part of paragraph
     * */
    @Override
    public StringBuilder getValue() {
        StringBuilder value = new StringBuilder();
        for (TextElement textElement : words) {
            value.append(textElement.getValue());
        }
        return value;
    }

    /** Method for return the list of word of particular sentence
     * object
     * @return the list of words
     * */
    public List<TextElement> getWords() {
        return words;
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
