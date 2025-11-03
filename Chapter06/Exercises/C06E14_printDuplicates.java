/*
Write a method called printDuplicates that takes as a parameter a Scanner containing
a series of lines. Your method should examine each line looking for consecutive
occurrences of the same token on the same line and print each duplicated token, along
 with the number of times that it appears consecutively. Nonrepeated tokens are not
 printed. You may ignore the case of repetition across multiple lines (such as if a
 line ends with a given token and the next line starts with the same token). You may
 assume that each line of the file contains at least 1 token of input.
*/

import java.io.*;
import java.util.*;

public class C06E14_printDuplicates {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "duplicates.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    printDuplicates(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void printDuplicates(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    // read each line
    while (input.hasNextLine()) {
      String line = input.nextLine();

      // create a new scanner to read each word on the line
      Scanner sc = new Scanner(line);

      // initialize tracking of the previous word and count
      String previousWord = sc.next();
      int duplicateCount = 1;

      // use while loop to go through remaining words
      while (sc.hasNext()) {
        String currentWord = sc.next();

        if (previousWord.equals(currentWord)) {
          duplicateCount++;
        } else {
          // end of the sequence of duplicates, or not a duplicae word

          if (duplicateCount > 1) {
            IO.print(previousWord + "*" + duplicateCount + " ");
          }

          previousWord = currentWord;
          duplicateCount = 1;
        }
      }

      if (duplicateCount > 1) {
        IO.print(previousWord + "*" + duplicateCount + " ");
      }
      IO.println();
    }
  }
}
