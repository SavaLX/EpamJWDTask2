package com.epam.task2.logic.comparator;

import com.epam.task2.entity.Sentence;

import java.util.Comparator;

public class AmountOfWordsComparator implements Comparator<Sentence> {
    @Override
    public int compare(Sentence o1, Sentence o2) {
        return (o1.getWords().size() - o2.getWords().size());
    }
}
