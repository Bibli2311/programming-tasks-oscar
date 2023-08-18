package com.example.helloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {

    // first row

    public String fRow;
    public String sRow;
    public String tRow;
    public String foRow;
    public String[] allRows;
    int cases = 0;

    public HelloWorld() {
        fRow = "1234567890-=";
        sRow = "QWERTYUIOP[]\\";
        tRow = "ASDFGHJKL;'";
        foRow = "ZXCVBNM,./";
        allRows = new String[]{fRow, sRow, tRow, foRow};
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

    public int validIndex(int[] list) {
        for (int i = 0; i < list.length; i++) {
           if (list[i] != -1) {
               return i;
           }
        }
        return  -1;
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
       String result = "";

       // first index is for index for first row.
        // second index is for index for second row, etc.
       int[] indices = {-1,-1,-1,-1};

       for (char c: input.toCharArray()) {
           // index for char that has been found in any of the keyboard rows
           int indexForChar = 0;

           for (int i = 0; i < indices.length; i++) {
               indices[i] = charExists(allRows[i], c);
           }
           // index for correct rows that is checked for this iteration of loop
           int correctRow =  validIndex(indices);
           int indexInCorrectRow = indices[correctRow];

//           System.out.println("rows: " + allRows[correctRow]);
//           System.out.println("char: " + allRows[correctRow].charAt(indexInCorrectRow));

           // check if index is not out of bounds
          if ((indexInCorrectRow - 1) >= 0)  {
              result += allRows[correctRow].charAt(indexInCorrectRow-1);
          }
//
//           indexForChar = charExists(sRow, c);
//           // if a character was found and the index for the character is larger or equal to 0
//           if (indexForChar != -1 && (indexForChar-1) >= 0) {
//               result += sRow.charAt(indexForChar-1);
//           }
           
       }

        System.out.println(result);
    }
    public static void main(String[] args) throws FileNotFoundException {
        HelloWorld myClass = new HelloWorld();
        myClass.doStuff();
    }

}
