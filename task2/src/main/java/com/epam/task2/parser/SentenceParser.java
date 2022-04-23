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

        for (int i = 0; i < words.length; i++) {
            Word word = new Word(new StringBuilder(words[i] + " "));
            listOfWords.add(word);
        }
        return listOfWords;
    }
}
