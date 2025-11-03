/*
Write a method called mostCommonNames that accepts a Scanner representing an input
file with names on each line separated by spaces. Some names appear multiple times in
a row on the same line. For each line, print the most commonly occurring name. If
there’s a tie, use the first name that had that many occurrences; if all names are
unique, print the first name on the line.
*/

import java.io.*;
import java.util.*;

public class C06E16_mostCommonNames {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "common_names.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    mostCommonNames(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void mostCommonNames(Scanner input) {

    // check for null input
    if (input == null) {
        throw new IllegalArgumentException("Input cannot be null.");
    }

    while (input.hasNextLine()) {
      String line = input.nextLine().trim();

      // Set up a temporary scanner to initialize the tracking variables
      Scanner firstPass = new Scanner(line);

      // Handle the case of an empty line, or line with no tokens
      if (!firstPass.hasNext()) {
          continue;
      }

      // Initialize tracking variables based on the first name
      String mostCommonName = firstPass.next();
      int maxCount = 1; // Fixed: maxtCount -> maxCount

      // Outer loop: Iterates through every name on the line
      Scanner nameIterator = new Scanner(line);

      while (nameIterator.hasNext()) {
        String currentName = nameIterator.next();

        // Inner logic: COUNTING
        // We create a new Scanner over the line for every name to count its frequency
        Scanner counterScanner = new Scanner(line);
        int currentCount = 0;

        while (counterScanner.hasNext()) {
          if (counterScanner.next().equals(currentName)) {
            currentCount++;
          }
        }

        // --- Comparison and Update Logic ---
        // Only update if the current name is strictly MORE common than the max so far.
        // This ensures that in case of a tie, the name that first set the maxCount (or the
        // first name on the line) remains the winner.
        if (currentCount > maxCount) {
          maxCount = currentCount;
          mostCommonName = currentName;
        }
      }

      // Print the final result for the line
      System.out.println("Most common: " + mostCommonName);
    }
  }
}
