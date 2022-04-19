package com.epam.task2;

import com.epam.task2.entity.CodeBlock;
import com.epam.task2.entity.Paragraph;
import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.Text;
import com.epam.task2.entity.Word;

public class Main {
    public static void main(String[] args) {

        Text text = new Text();

        Paragraph paragraph = new Paragraph();
        Paragraph paragraph1 = new Paragraph();
        Paragraph paragraph2 = new Paragraph();

        Sentence sentence = new Sentence();
        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        Sentence sentence3 = new Sentence();

        Word word = new Word();
        Word word1 = new Word();
        Word word2 = new Word();

        CodeBlock codeBlock = new CodeBlock();
        CodeBlock codeBlock1 = new CodeBlock();
        CodeBlock codeBlock2 = new CodeBlock();


        text.addElement(paragraph);
        text.addElement(paragraph1);
        text.addElement(paragraph2);
        text.addElement(codeBlock);
        text.addElement(codeBlock1);
        text.addElement(codeBlock2);

        paragraph.addElement(sentence);
        paragraph1.addElement(sentence1);
        paragraph1.addElement(sentence2);
        paragraph2.addElement(sentence3);

        sentence.addElement(word);
        sentence1.addElement(word1);
        sentence2.addElement(word2);

        text.getValue();

    }
}
