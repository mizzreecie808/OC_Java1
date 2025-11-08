/*
Students are often asked to write term papers containing a certain number of words.
Counting words in a long paper is a tedious task, but the computer can help. Write a
program that counts the number of words, lines, and total characters (not including
whitespace) in a paper, assuming that consecutive words are separated either by spaces
or end-of-line characters.
*/

import java.util.Scanner;

public class C06PP01_termPaper {

  public static final String DIRECTORY = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";

  public static void main(String[] args) throws FileNotFoundException {

    File fileTermPaper = new File(DIRECTORY, "term_paper.txt");

    // check the file exists
    if (!fileTermPaper.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the Scanner for input
    Scanner scTermPaper = new Scanner(filePigLatin);

    // 2. Pass the input Scanner to the method
    pigLatin(scTermPaper);

    // 3. Close the scanner
    scTermPaper.close();
  }

  public static void termPaper(Scanner paper) {

    // check if input is null
    if (paper == null) {
      throw new IllegalArgumentException("Input cannot be null");
    }

    // 1. Loop through each line & count total amount of lines
    int lineCount = 0;
    int wordCount = 0;
    int charCount = 0;

    while (input.hasNextLine()) {
      lineCount++;
      String line = input.hasNext();

      // 2. Loop through each word
      Scanner wordScanner = new Scanner(line);
      while (wordScanner.hasNext()) {
        wordCount++;
        String word = wordScanner.next();

        // 3. Count each character (excluding whitespace)
        charCount += word.length();
      }
    }
    IO.println("Total lines: %d\nTotal words: %d\nTotal chars: %d", lineCount, wordCount, charCount);
  }
