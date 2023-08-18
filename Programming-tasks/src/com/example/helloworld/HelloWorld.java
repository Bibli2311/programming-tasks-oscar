package com.example.helloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {

    // first row
    public String fRow;
    int cases = 0;

    public HelloWorld() {
        fRow = "qwertyuiop[]\\";

    }

    public int charExists(String list, char myChar) {
        int charIndex = 0;
       for (; charIndex < list.length(); charIndex++) {
          if (list.charAt(charIndex) == myChar) {
              return charIndex;
          }
        }

       return -1;
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
           // index for char that has been found in any of the keyboard rows
           int indexForChar = 0;
           indexForChar = charExists(fRow, c);
           if (indexForChar != -1) {
               // print out character left for found key
//               System.out.println("before: " + indexForChar);
               System.out.println(fRow.charAt(indexForChar-1));
           }
       }
    }
    public static void main(String[] args) throws FileNotFoundException {
        HelloWorld myClass = new HelloWorld();
        myClass.doStuff();
    }

}
