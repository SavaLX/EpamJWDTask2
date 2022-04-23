package com.epam.task2;

import com.epam.task2.entity.Text;
import com.epam.task2.entity.TextElement;
import com.epam.task2.parser.TextParser;
import com.epam.task2.reader_writer.TextWriter;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TextParser textParser = new TextParser();
        List<TextElement> list = textParser.parse();

        Text text = new Text(list);
        TextWriter textWriter = new TextWriter();
        textWriter.writeTextInFile(text);


//        System.out.println(text.getValue());



















//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getValue());
//        }
    }
}
