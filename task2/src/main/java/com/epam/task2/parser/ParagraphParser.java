package com.epam.task2.parser;

import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.TextElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ParagraphParser {

    private static final String REGEX_SENTENCE = "\\.\s";
    SentenceParser sentenceParser = new SentenceParser();

    public List<TextElement> parse(@NotNull String line) {

        String[] sentencesArray = line.split(REGEX_SENTENCE);
        List<TextElement> sentences = new ArrayList<>();

        for (int i = 0; i < sentencesArray.length; i++) {
            sentences.add(new Sentence(sentenceParser.parse(sentencesArray[i] + ". ")));
        }

        return sentences;
    }
}
