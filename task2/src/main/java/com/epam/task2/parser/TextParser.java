package com.epam.task2.parser;

import com.epam.task2.entity.CodeBlock;
import com.epam.task2.entity.Paragraph;
import com.epam.task2.entity.TextElement;
import com.epam.task2.reader_writer.TextReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {

    private static final String REGEX_PARAGRAPHS = "^([A-Z]|[1-9])";
    private static final String REGEX_CODE_LINES = "^(void|class)|^(\\s+)|(\\})";

    public List<TextElement> parse() {

        List<String> textLines = parseTextToLines();
        List<TextElement> elements = new ArrayList<>();
        ParagraphParser paragraphParser = new ParagraphParser();
        CodeParser codeParser = new CodeParser();
        Pattern pattern = Pattern.compile(REGEX_PARAGRAPHS);

        for (String string : textLines) {
            String str = string;
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                elements.add(new Paragraph(paragraphParser.parse(str)));
            } else {
                elements.add(new CodeBlock(new StringBuilder(str)));
            }
        }

        return elements;
    }

    public List<String> parseTextToLines() {

        TextReader textReader = new TextReader();

        Scanner scanner = new Scanner(textReader.textRead().toString());
        String line;
        List<String> lines = new ArrayList<>();
        StringBuilder codeLines = new StringBuilder();

        Pattern pattern = Pattern.compile(REGEX_PARAGRAPHS);

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

        return lines;
    }
}