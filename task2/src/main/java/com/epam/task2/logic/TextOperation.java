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

public class TextOperation {

    private static final Logger logger = LogManager.getLogger(TextOperation.class);

    public List<Sentence> taskTwo(Text text) {

        logger.debug("Start task two");

        List<List<TextElement>> listsOfSentences = new ArrayList<>();

        for (TextElement textElement : text.getParagraphsAndCodeBlocks()) {
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
