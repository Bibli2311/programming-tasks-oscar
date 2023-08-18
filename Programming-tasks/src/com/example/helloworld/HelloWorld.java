package com.example.helloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {

    // first row
    public String[] fRow;
    int cases = 0;

    public HelloWorld() {
        fRow =  new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "\\"};
    }

    public boolean charExists(String list, char myChar) {
       boolean charFound = false;
       for (char c: list.toCharArray()) {
          if (c == myChar) { charFound = true; break; }
       }
       return charFound;
    };


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

       Scanner myScan  = new Scanner(System.in);
       String input = myScan.nextLine();
       System.out.println("input: " + input);

       for (char c: input.toCharArray()) {

       }
    }
    public static void main(String[] args) throws FileNotFoundException {
        HelloWorld myClass = new HelloWorld();
        myClass.doStuff();
    }

}
