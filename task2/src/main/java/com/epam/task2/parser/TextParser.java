package com.epam.task2.parser;

import com.epam.task2.entity.CodeBlock;
import com.epam.task2.entity.Paragraph;
import com.epam.task2.entity.TextElement;
import com.epam.task2.reader_writer.TextReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {
    private static final String REGEX_PARAGRAPHS = "^([A-Z]|[1-9])";

    private static final Logger logger = LogManager.getLogger(TextParser.class);

    public List<TextElement> parse() {

        List<String> textLines = parseTextToLines();
        List<TextElement> elements = new ArrayList<>();
        ParagraphParser paragraphParser = new ParagraphParser();
        Pattern pattern = Pattern.compile(REGEX_PARAGRAPHS);

        logger.debug("Start parsing text lines into paragraphs and code lines and save them in List<TextElement>");

        for (String string : textLines) {
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
                elements.add(new Paragraph(paragraphParser.parse(string)));
            } else {
                elements.add(new CodeBlock(new StringBuilder(string)));
            }
        }

        logger.debug("List<TextElement has been completed with paragraphs and code blocks");
        return elements;
    }

    public List<String> parseTextToLines() {

        TextReader textReader = new TextReader();

        Scanner scanner = new Scanner(textReader.textRead().toString());
        String line;
        List<String> lines = new ArrayList<>();
        StringBuilder codeLines = new StringBuilder();

        Pattern pattern = Pattern.compile(REGEX_PARAGRAPHS);

        logger.debug("Start dividing text into lines");

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            Matcher matcher1 = pattern.matcher(line);
            if (matcher1.find()) {
                lines.add(line);
            } else {
                codeLines.append(line);
                lines.add(codeLines.toString());
                codeLines.setLength(0);
            }
        }
        scanner.close();

        logger.debug("Text has been divided in lines");

        return lines;
    }
}