/*
Write a method called negativeSum that accepts a Scanner reading input from a file
containing a series of integers, and print a message to the console indicating whether
the sum starting from the first number is ever negative. You should also return true if
a negative sum can be reached and false if not.
*/

import java.io.*;
import java.util.*;

public class C06E03_negativeSum {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "negatives.txt");

    // check the file exists
    // ensure the file is present
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    negativeSum(fileScanner);

  }

  public static boolean negativeSum(Scanner input) {

    int count = 0, sum = 0;
    boolean negativeFlag = false;

    while (input.hasNext()) {
      if (input.hasNextInt()) {
        int num = input.nextInt();
        count++;
        sum += num;
        if (sum < 0) {
          negativeFlag = true;
          break;
        }
      // just in case a random string is in the txt file
      } else {
        input.next();
      }
    }
    if(negativeFlag) {
      IO.println("sum of " + sum + " after " + count + " steps");
    } else {
      IO.println("no negative sum");
    }
    return negativeFlag;
  }
}
