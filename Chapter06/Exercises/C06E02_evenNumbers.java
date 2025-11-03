/*
Write a method called evenNumbers that accepts a Scanner reading input from a file with
a series of integers, and report various statistics about the integers to the console.
Report the total number of numbers, the sum of the numbers, the count of even numbers
and the percent of even numbers.
*/

import java.io.*;
import java.util.*;

public class C06E02_evenNumbers {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "evens.txt");

    // check the file exists
    // ensure the file is present
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    evenNumbers(fileScanner);

  }

  public static void evenNumbers(Scanner input) {

    int count = 0, sum = 0, countEvens = 0;

    while (input.hasNext()) {
      if (input.hasNextInt()) {
        int num = input.nextInt();
        count++;
        sum += num;
        if (num % 2 == 0) {
          countEvens++;
        }
      // just in case a random string is in the txt file
      } else {
        input.next();
      }
    }
    double percentEvens = (double) countEvens / count * 100.0;
    IO.println(count + " numbers, sum = " + sum);
    System.out.printf("%d evens (%.2f%%)\n",countEvens, percentEvens);
  }
}
