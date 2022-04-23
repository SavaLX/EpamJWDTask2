package com.epam.task2.reader_writer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class TextReader {

    private static final Logger logger = LogManager.getLogger(TextReader.class);

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
            //TODO: logger and solve the dots
        }

        logger.debug("Text has been reading from file");

        return stringBuilder;
    }
}
