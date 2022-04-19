package com.epam.task2.reader_writer;

import com.epam.task2.entity.Text;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TextReader {

    public StringBuilder textRead() {
        StringBuilder stringBuilder = new StringBuilder();
        Text text = new Text();

        try (FileInputStream fileInputStream = new FileInputStream("text.txt")) {

            Scanner scanner = new Scanner(fileInputStream);

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            //TODO: logger
        }
        return stringBuilder;
    }
}
