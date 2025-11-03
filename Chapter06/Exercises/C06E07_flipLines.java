/*
Write a method called flipLines that accepts a Scanner for an input file and writes to
the console the same file’s contents with each pair of lines reversed in order. If the
file contains an odd number of lines, leave the last line unmodified.
*/

import java.io.*;
import java.util.*;

public class C06E07_flipLines {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "flip.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    flipLines(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void flipLines(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    String firstLine, secondLine;

    while (input.hasNextLine()) {
      // 1. get the first line
      firstLine = input.nextLine();

      if (input.hasNextLine()) {
        secondLine = input.nextLine();
        IO.println(secondLine);
        IO.println(firstLine);
      } else {
        IO.println(firstLine);
      }
    }
  }
}
