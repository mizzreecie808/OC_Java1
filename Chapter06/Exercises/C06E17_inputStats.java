/*
Write a method called inputStats that accepts a Scanner representing an input file
and reports the number of lines, the longest line, the number of tokens on each line,
and the length of the longest token on each line.
*/

import java.io.*;
import java.util.*;

public class C06E17_inputStats {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "stats.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    inputStats(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  // - 6.17 inputStats
  public static void inputStats(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    // read each line
    int lineNum = 1;
    int longestLineLength = 0;
    String longestLine = "";
    while (input.hasNextLine()) {
      String line = input.nextLine();
      int currentLineLength = line.length();

      if (currentLineLength > longestLineLength) {
        longestLineLength = currentLineLength;
        longestLine = line;
      }

      // create a new scanner to read each word on the line
      Scanner sc = new Scanner(line);

      int longestWord = 0;
      int wordCount = 0;

      // use while loop to go through remaining words
      while (sc.hasNext()) {
        int lineLength = sc.next().length();
        if (lineLength > longestWord) {
          longestWord = lineLength;
        }
        wordCount++;
      }
      System.out.printf("Line %d has %d tokens (longest = %s)\n", lineNum, wordCount, longestWord);
      lineNum ++;
    }
    IO.println("Longest line: " + longestLine);
  }
}
