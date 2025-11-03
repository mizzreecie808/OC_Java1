/*
Write a method called stripHtmlTags that accepts a Scanner representing an input
file containing an HTML web page as its parameter, then reads that file and prints the
file’s text with all HTML tags removed. A tag is any text between the characters < and >.
*/

import java.io.*;
import java.util.*;

public class C06E12_stripHtmlTags {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "html.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    stripHtmlTags(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void stripHtmlTags(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    // htmlTag will track if loop is inside an actual HTML tag
    boolean inTag = false;

    // read each line
    while (input.hasNextLine()) {
      String line = input.nextLine();
      int lineLength = line.length();

      // Process the line character by character
      for (int i = 0; i < lineLength; i++) {
        char currentChar = line.charAt(i);

        if (currentChar == '<') {
          // start of the HTML tag, switch to inTag
          inTag = true;
        } else if (currentChar == '>') {
          // end of the HTML tag, with to false inTag
          inTag = false;
        } else if (!inTag) {
          IO.print(currentChar);
        }
      }
      IO.println();
    }
  }
}
