/*
Write a method called wordWrap that accepts a Scanner representing an input file as
its parameter and outputs each line of the file to the console, word-wrapping all lines
that are longer than 60 characters. For example, if a line contains 112 characters,
the method should replace it with two lines: one containing the first 60 characters and
another containing the final 52 characters. A line containing 217 characters should be
wrapped into four lines: three of length 60 and a final line of length 37.
*/

import java.io.*;
import java.util.*;

public class C06E09_wordWrap {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "words.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    wordWrap(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  // - 6.9 wordWrap max 60 characters per line
  public static void wordWrap(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    while (input.hasNextLine()) {
      String line = input.nextLine();

      int maxChars = 60;
      int startIndex = 0;

      while (startIndex < line.length()) {

        // calculate the ending index
        int endIndex = startIndex + maxChars;

        if (endIndex > line.length()) {
          endIndex = line.length();
        }

        String shortLine = line.substring(startIndex, endIndex);
        IO.println(shortLine);

        // update the starting index by moving it foward 60 characters
        startIndex += maxChars;
      }
    }
  }
}
