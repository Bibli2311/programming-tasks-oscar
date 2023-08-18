package com.example.helloworld;

import java.io.FileNotFoundException;
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

           // if key checked now exists (letters like lower-case letters should be ignored)
           if (correctRow != -1) {
               int indexInCorrectRow = indices[correctRow];

               // check if index is not out of bounds
               if ((indexInCorrectRow - 1) >= 0)  {
                   result += allRows[correctRow].charAt(indexInCorrectRow-1);
               }
           }
           else {
               if (c == ' ') { result += ' '; }
           }
       }

        System.out.println(result);
    }
    public static void main(String[] args) throws FileNotFoundException {
        HelloWorld myClass = new HelloWorld();
        myClass.doStuff();
    }

}
