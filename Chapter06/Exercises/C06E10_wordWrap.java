/*
Modify the preceding wordWrap method so that it outputs the newly wrapped text back
into the original file.
(Be careful—don’t output into a file while you are reading it!)
Use a class constant for the maximum line length rather than hard-coding 60.
*/

import java.io.*;
import java.util.*;

public class C06E10_wordWrap {

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

  // - 6.9 wordWrap max 60 characters per line
  public static void wordWrap(Scanner input, File originalFile) throws FileNotFoundException {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    String output = "";

    while (input.hasNextLine()) {
      String line = input.nextLine();

      int startIndex = 0;

      while (startIndex < line.length()) {

        // calculate the ending index
        int endIndex = startIndex + MAX_CHARS;

        // ensure endIndex does not go past the end of the line
        if (endIndex > line.length()) {
          endIndex = line.length();
        }

        String shortLine = line.substring(startIndex, endIndex);

        // append the wrapped line to the String adding a newline
        output += shortLine + "\n";

        // update the starting index by moving it foward 60 characters
        startIndex += MAX_CHARS;
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
