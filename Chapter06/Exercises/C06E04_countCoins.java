/*
Write a method called countCoins that accepts a Scanner representing an input file
whose data is a series of pairs of tokens, where each pair begins with an integer and
is followed by the type of coin, which will be
“pennies” (1 cent each)
“nickels” (5 cents each)
“dimes” (10 cents each), or
“quarters” (25 cents each), case-insensitively.
Add up the cash values of all the coins and print the total money.
*/

import java.io.*;
import java.util.*;

public class C06E04_countCoins {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "coins.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    countCoins(fileScanner);

    // 3. Close the scannerFiles
    fileScanner.close();

  }

  public static void countCoins(Scanner input) {

    // check for null input
    if (input == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    double sum = 0.0;

    while (input.hasNext()) {
      int coinCount = input.nextInt();
      String coinType = input.next();
      double coinSum = coinCount * coinValue(coinType);
      sum += coinSum;
    }
    System.out.printf("Total money: $%.2f\n", sum);
  }

  public static double coinValue(String coinType) {
    // don't bother with all the if statements if a blank/null string is passed
    if (coinType.length() == 0) {
      return 0.0;
    }

    char c = Character.toLowerCase(coinType.charAt(0));

    if (c == 'p') {
      return 0.01;
    } else if (c == 'n') {
      return 0.05;
    } else if (c == 'd') {
      return 0.10;
    } else if (c == 'q') {
      return 0.25;
    } else {
      // just in case there is some erroneous letter passed
      return 0.0;
    }
  }
}
