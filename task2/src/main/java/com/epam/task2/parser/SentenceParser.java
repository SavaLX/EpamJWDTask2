package com.epam.task2.parser;

import com.epam.task2.entity.TextElement;
import com.epam.task2.entity.Word;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser {

    private static final String REGEX_WORDS = " ";

    public List<TextElement> parse(@NotNull String sentence) {

        String[] words = sentence.split(REGEX_WORDS);
        List<TextElement> listOfWords = new ArrayList<>();

        for (String s : words) {
            Word word = new Word(new StringBuilder(s + " "));
            listOfWords.add(word);
        }
        return listOfWords;
    }
}