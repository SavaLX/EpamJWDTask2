package com.epam.task2.parser;

import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.TextElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ParagraphParser {

    private static final String REGEX_SENTENCE = "\\.\s";
    private final SentenceParser sentenceParser = new SentenceParser();

    private static final Logger logger = LogManager.getLogger(ParagraphParser.class);

    public List<TextElement> parse(@NotNull String line) {

        String[] sentencesArray = line.split(REGEX_SENTENCE);
        List<TextElement> sentences = new ArrayList<>();

        logger.debug("Start parsing paragraphs into sentences and save them into List<TextElement>");

        for (String s : sentencesArray) {
            sentences.add(new Sentence(sentenceParser.parse(s + ". ")));
        }

        logger.debug("List<TextElement> has been completed with sentences");

        return sentences;
    }
}
