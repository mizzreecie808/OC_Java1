/*
Write a method called randomLines that prints between 5 and 10 random strings of letters
(between “a” and “z”), one per line. Each string should have random length of up to 80
characters.
*/

import java.util.*;

public class C05E05_randomLines {
  public static void main(String[] args) {

    randomLines();

  }

  public static void randomLines() {

    // hold the number of lines to print
    int lines = (int)(Math.random() * (6)) + 5;

    int i = 1;
    while (i <= lines) {
      IO.println(randomString());
      i++;
    }
  }

  public static String randomString() {
    int min = 97;
    int max = 122;
    String output = "";
    // Random object initialization
    Random r = new Random();
    int strLength = r.nextInt(81);

    int i = 1;
    while (i <= strLength) {
      char nextChar = (char)(r.nextInt(max - min + 1) + min);
      output += nextChar;
      i++;
    }
    return output;
  }
}
