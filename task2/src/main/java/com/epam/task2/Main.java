package com.epam.task2;

import com.epam.task2.entity.Text;
import com.epam.task2.entity.TextElement;
import com.epam.task2.logic.TextOperation;
import com.epam.task2.parser.TextParser;
import com.epam.task2.reader_writer.TextWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("The application has been started");

        TextParser textParser = new TextParser();
        List<TextElement> list = textParser.parse();

        Text text = new Text(list);
        TextWriter textWriter = new TextWriter();
        textWriter.writeTextInFile(text);

        logger.info("The application has been finished");


        logger.info("Task two has been started");
        TextOperation textOperation = new TextOperation();
        textWriter.writeTaskTwoInFile(textOperation.taskTwo(text));
        logger.info("Task two has been finished");


    }
}
