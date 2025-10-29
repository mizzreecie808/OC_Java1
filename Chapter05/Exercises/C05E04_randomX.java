/*
Write a method called randomX that prints a lines that contain a random number of “x”
characters (between 5 and 20 inclusive) until it prints a line that contains 16 or more
characters.
*/

import java.util.*;

public class C05E04_randomX {
  public static void main(String[] args) {

    randomX();

  }

  public static void randomX() {

    int min = 5;
    int max = 20;

    // Random object initialization
    Random r = new Random();

    // hold the number of "*" to print
    int lineLength;

    // using do/while ensures at least one line is printed
    do {
      // generate a random number between 5 & 20 inclusive
      lineLength = r.nextInt(max - min + 1) + min;

      // print the "*" using printStars()
      printStars(lineLength);
      IO.println();
    } while (lineLength < 16);
  }


  public static void printStars(int num) {
    for (int i = 0; i < num; i++) {
      IO.print("*");
    }
  }
}
