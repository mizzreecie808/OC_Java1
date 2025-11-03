/*
Write a method called collapseSpaces that accepts a Scanner representing an input file
as its parameter, then reads that file and outputs it with all its tokens separated by
single spaces, collapsing any sequences of multiple spaces into single spaces.
*/

import java.io.*;
import java.util.*;

public class C06E05_collapseSpaces {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "spaces.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    collapseSpaces(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void collapseSpaces(Scanner input) {

    while (input.hasNext()) {
      // 1. get the current word
      String currWord = input.next();

      // 2. print the current word
      IO.print(currWord);

      // 3. check if there is going to be another word, add a space
      if (input.hasNext()) {
        System.out.print(" ");
      }
    }
  }
}
