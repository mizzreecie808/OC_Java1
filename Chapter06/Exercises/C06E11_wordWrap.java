/*
Modify the preceding wordWrap method so that it only wraps whole words, never chopping
a word in half. Assume that a word is any whitespace-separated token and that all words
are under 60 characters in length.
*/

import java.io.*;
import java.util.*;

public class C06E11_wordWrap {

  public static final int MAX_CHARS = 60;
  public static final String DIRECTORY = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";

  public static void main(String[] args) throws FileNotFoundException {

    // use the same file object for both input (scanner) and output (printstream)
    File f = new File(DIRECTORY, "words.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    wordWrap(fileScanner, f);

    // 3. Close the scannerFiles
    fileScanner.close();

    // 4. Validate
    IO.println("Successfully wrapped text in: " + f.getAbsolutePath());

  }

  public static void wordWrap(Scanner input, File originalFile) throws FileNotFoundException {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    String output = "";
    int currentLineLength = 0;

    // 1. READ & PROCESS word by word
    while (input.hasNext()) {
      String word = input.next();
      int wordLength = word.length();

      if (currentLineLength == 0) {
        // if it's the start of a new line, just add the word
        output += word;
        currentLineLength = wordLength;

      } else if (currentLineLength + 1 + wordLength <= MAX_CHARS) {
        // the word fits (1 is for the required space)
        output += " " + word;
        currentLineLength += 1 + wordLength;

      } else {
        // the word does not fit
        // append a newline character to the output
        output += "\n";

        // start a new line with the current word
        output += word;
        currentLineLength = wordLength;
      }
    }
    // Write back to the original file
    // 1. Create the PrintStream instance (output stream)
    PrintStream outputStream = new PrintStream(originalFile);

    // 2. send the updated string to the same file
    outputStream.print(output);

    // 3. close output stream
    outputStream.close();
  }
}
