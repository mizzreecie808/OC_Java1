/*
Write a method called readEntireFile that accepts a Scanner representing an input file
as its parameter, then reads that file and returns its entire text contents as a String.
*/

import java.io.*;
import java.util.*;

public class C06E06_readEntireFile {
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
    String fileContents = readEntireFile(fileScanner);

    // 3. Print the result (now done in main)
    IO.println("--- File Contents ---");
    IO.println(fileContents);
    IO.println("---------------------");

    // 4. Close the scannerFiles
    fileScanner.close();

  }

  public static String readEntireFile(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    String output = "";
    while (input.hasNextLine()) {
      // 1. get the current line
      String currentLine = input.nextLine();

      // 2. append to output
      output += currentLine;

      // 3. add a new line only if it's not the last line
      if (input.hasNextLine()) {
        output += "\n";
      }
    }
    return output;
  }
}
