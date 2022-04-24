package com.epam.task2.reader_writer;

import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/** Class for write data to file*/
public class TextWriter {

    private static final Logger logger = LogManager.getLogger(TextWriter.class);

    /**
     * Method for write completed text to file
     * @param text - text that write to file
     * */
    public void writeTextInFile(Text text) {

        logger.debug("Start writing parsed text in output file");

        try (FileWriter fileWriter = new FileWriter("D:\\MyRepository\\EpamTask2\\task2\\" +
                "src\\main\\resources\\textFiles\\outputText.txt", false)) {
            StringBuilder stringBuilder = text.getValue();
            fileWriter.write(String.valueOf(stringBuilder));

            fileWriter.flush();
        } catch (IOException e) {
            logger.error("The collected text could not be written to file");
        }

        logger.debug("Text has been writing in output file");
    }

    /**
     * Method for writing sentences of text in ascending order of the words in each one to a file
     * @param sentences - list of sentences that need to sort
     * */
    public void writeTaskTwoInFile(List<Sentence> sentences) {

        logger.debug("Start writing task two in output file");

        try (FileWriter fileWriter = new FileWriter("D:\\MyRepository\\EpamTask2\\task2\\" +
                "src\\main\\resources\\textFiles\\task2.txt", false)) {

            for (Sentence sentence : sentences) {
                fileWriter.write(sentence.getValue().toString() + "\n");
            }

            fileWriter.flush();
        } catch (IOException e) {
            logger.error("The task two could not be written to file");
        }

        logger.debug("Task2 has been writing in output file");
    }
}
