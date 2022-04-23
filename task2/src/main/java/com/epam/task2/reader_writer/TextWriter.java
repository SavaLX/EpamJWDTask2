package com.epam.task2.reader_writer;

import com.epam.task2.entity.Text;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
    public void writeTextInFile(Text text) {
        try (FileWriter fileWriter = new FileWriter("D:\\MyRepository\\EpamTask2\\task2\\" +
                "src\\main\\resources\\textFiles\\outputText.txt", false)) {
            StringBuilder stringBuilder = text.getValue();
            fileWriter.write(String.valueOf(stringBuilder));

            fileWriter.flush();
        } catch (IOException e) {
            //TODO: add logger
        }
    }
}
