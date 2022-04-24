package com.epam.task2.parser;

import com.epam.task2.entity.TextElement;
import com.epam.task2.entity.Word;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for parsing sentences into words
 * */
public class SentenceParser {

    /** Field of regex for split sentence by words */
    private static final String REGEX_WORDS = " ";

    private static final Logger logger = LogManager.getLogger(SentenceParser.class);

    /**
     * Method for parsing sentences into words
     * @return list of words
     * @param sentence - sentence that need to parse
     * @see ParagraphParser#parse(String) ()
     * */
    public List<TextElement> parse(@NotNull String sentence) {

        String[] words = sentence.split(REGEX_WORDS);
        List<TextElement> listOfWords = new ArrayList<>();

        logger.debug("Start parsing sentences into words and save them in List<TextElement>");

        for (String s : words) {
            Word word = new Word(new StringBuilder(s + " "));
            listOfWords.add(word);
        }

        logger.debug("List<TextElement> has been completed with words");

        return listOfWords;
    }
}