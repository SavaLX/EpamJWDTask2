package com.epam.task2.parser;

import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.TextElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for parsing paragraphs into sentences
 * */
public class ParagraphParser {

    /** Field of regex for split sentences in paragraph */
    private static final String REGEX_SENTENCE = "\\.\s";
    private static final Logger logger = LogManager.getLogger(ParagraphParser.class);

    /**
     * Method for parsing paragraph into sentences
     * @return list sentences
     * @param line paragraph that need to parse
     * @see TextParser#parse()
     * @see SentenceParser#parse(String)
     * */
    public List<TextElement> parse(@NotNull String line) {

        SentenceParser sentenceParser = new SentenceParser();
        String[] sentencesArray = line.split(REGEX_SENTENCE);
        List<TextElement> sentences = new ArrayList<>();

        logger.debug("Start parsing paragraphs into sentences and save them into List<TextElement>");

        for (String s : sentencesArray) {
            if (s.endsWith(":") || s.endsWith(".")) {
                sentences.add(new Sentence(sentenceParser.parse(s + " ")));
            } else {
                sentences.add(new Sentence(sentenceParser.parse(s + ". ")));
            }
        }

        logger.debug("List<TextElement> has been completed with sentences");

        return sentences;
    }
}
