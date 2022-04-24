package com.epam.task2.logic;

import com.epam.task2.entity.Paragraph;
import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.Text;
import com.epam.task2.entity.TextElement;
import com.epam.task2.logic.comparator.AmountOfWordsComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class of logic with different operation inder text
 */
public class TextOperation {

    private static final Logger logger = LogManager.getLogger(TextOperation.class);


    /**
     * Method for find all text sentences in input text and sort them in ascending order of the words in each one
     * by comparator
     *
     * @param text - text in which the sentences are
     * @return sort list sentences
     * @see AmountOfWordsComparator#compare(Sentence, Sentence) ()
     */
    public List<Sentence> taskTwo(Text text) {

        logger.debug("Start task two");

        List<List<TextElement>> listsOfSentences = new ArrayList<>();

        for (TextElement textElement : text.getParagraphsAndCodeLines()) {
            if (textElement instanceof Paragraph) {
                listsOfSentences.add(((Paragraph) textElement).getSentences());
            }
        }

        List<Sentence> sentences = new ArrayList<>();
        for (List<TextElement> list : listsOfSentences) {
            for (TextElement sentence : list) {
                sentences.add((Sentence) sentence);
            }
        }

        AmountOfWordsComparator comparator = new AmountOfWordsComparator();
        Collections.sort(sentences, comparator);

        logger.debug("Task two has been finished");

        return sentences;
    }
}
