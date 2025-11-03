/*
Write a method called plusScores that accepts a Scanner representing an input file
containing a series of lines that represent student records. Each student record takes
up two lines of input. The first line has the student’s name and the second line has a
series of plus and minus characters.

Kane, Erica
--+-+
Chandler, Adam
++-+
Martin, Jake
+++++++

For each student you should produce a line of output with the student’s name followed by
a colon followed by the percent of plus characters.
Kane, Erica: 40.0% plus
Chandler, Adam: 75.0% plus
Martin, Jake: 100.0% plus
*/

import java.io.*;
import java.util.*;

public class C06E18_plusScores {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "scores.txt");

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
    while (input.hasNextLine()) {
      String name = input.nextLine();
      String scores = input.nextLine();

      // declare int variables to track scores
      // use count just in case there are random characters aside from +/-
      int count = 0;
      int plus = 0;
      int minus = 0;

      for (int i = 0; i < scores.length(); i++) {
        if (scores.charAt(i) == '+') {
          plus++;
          count++;
        } else if (scores.charAt(i) == '-') {
          minus++;
          count++;
        }
      }
      double percent = plus / (double) count * 100.0;
      System.out.printf("%s: %.1f%% plus\n", name, percent);
    }
  }
}
