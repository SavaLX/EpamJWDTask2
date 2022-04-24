package com.epam.task2.reader_writer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/** Class for read text from input file*/
public class TextReader {

    private static final Logger logger = LogManager.getLogger(TextReader.class);

    /**
     * Method for read text from file into StringBuilder
     * @return the text that has been reading from file
     * */
    public StringBuilder textRead() {
        StringBuilder stringBuilder = new StringBuilder();

        logger.debug("Start reading text from input file");

        try (FileInputStream fileInputStream = new FileInputStream("D:\\MyRepository\\EpamTask2\\task2\\" +
                "src\\main\\resources\\textFiles\\inputText.txt")) {

            Scanner scanner = new Scanner(fileInputStream);

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            logger.error("The input file could not be read");
        }

        logger.debug("Text has been reading from file");

        return stringBuilder;
    }
}
