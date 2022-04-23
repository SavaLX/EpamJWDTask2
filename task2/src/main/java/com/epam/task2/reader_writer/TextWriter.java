package com.epam.task2.reader_writer;

import com.epam.task2.entity.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

    private static final Logger logger = LogManager.getLogger(TextWriter.class);

    public void writeTextInFile(Text text) {

        logger.debug("Start writing parsed text in output file");

        try (FileWriter fileWriter = new FileWriter("D:\\MyRepository\\EpamTask2\\task2\\" +
                "src\\main\\resources\\textFiles\\outputText.txt", false)) {
            StringBuilder stringBuilder = text.getValue();
            fileWriter.write(String.valueOf(stringBuilder));

            fileWriter.flush();
        } catch (IOException e) {
            //TODO: add logger
        }

        logger.debug("Text has been writing in output file");
    }
}
