package com.example.helloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld {

    public static String readAllLines(BufferedReader localReader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = localReader.readLine()) != null) {
           content.append(line);
           content.append((System.lineSeparator()));
        }
        return content.toString();
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hellow world");

        BufferedReader reader = new BufferedReader(new FileReader("src/com/example/resources/input.txt"));
        try {
            String lineContent = readAllLines(reader);
            System.out.println(lineContent);
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }

}
