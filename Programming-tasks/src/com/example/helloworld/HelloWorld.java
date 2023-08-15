package com.example.helloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld {

    int cases = 0;

    public static String readAllLines(BufferedReader localReader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = localReader.readLine()) != null) {
           content.append(line);
           content.append((System.lineSeparator()));
        }
        return content.toString();
    }

    public void doStuff() {
        System.out.println("hellow world");


        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/com/example/resources/input.txt"));
            cases = 10;
            String fileContent = readAllLines(reader);
            System.out.println(fileContent);
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        HelloWorld myClass = new HelloWorld();
        myClass.doStuff();
    }

}
