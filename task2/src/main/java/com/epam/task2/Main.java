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

        TextOperation textOperation = new TextOperation();
        TextParser textParser = new TextParser();
        TextWriter textWriter = new TextWriter();


        logger.info("The application has been started");
        List<TextElement> list = textParser.parse();
        Text text = new Text(list);
        textWriter.writeTextInFile(text);


        logger.info("Task two has been started");
        textWriter.writeTaskTwoInFile(textOperation.taskTwo(text));
        logger.info("Task two has been finished");

        logger.info("The application has been finished");
    }
}
