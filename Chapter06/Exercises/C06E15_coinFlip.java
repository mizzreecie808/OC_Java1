/*
Write a method called coinFlip that accepts a Scanner representing an input file of
coin flips that are heads (H) or tails (T). Consider each line to be a separate set
of coin flips and output the number and percentage of heads in that line. If it is
more than 50%, print “You win!”.
*/

import java.io.*;
import java.util.*;

public class C06E15_coinFlip {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "coin_flip.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    coinFip(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void coinFip(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    while (input.hasNextLine()) {
      int heads = 0;
      int tails = 0;

      String line = input.nextLine();
      line = line.toLowerCase();

      // loop counting heads and tails
      for (int i = 0; i < line.length(); i++) {
        char flip = line.charAt(i);

        if (flip == 't') {
          tails ++;
        } else if (flip == 'h') {
          heads++;
        }
      }
      double wins = heads / ((double) heads + tails) * 100;
      System.out.printf("%d heads (%.1f)\n", heads, wins);
      if (wins > 50) {
        IO.println("You win!");
      }
      IO.println();
    }
  }
}
