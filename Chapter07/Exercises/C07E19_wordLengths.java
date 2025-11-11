/*
Write a method called wordLengths that accepts a Scanner for an input file as its
parameter. Your method should open the given file, count the number of letters in each
token in the file, and output a result diagram of how many words contain each number of
letters.
*/
import java.io.*;
import java.util.*;

public class C07E19_wordLengths {

  // The string of vowels is ordered to match the array indices: A=0, E=1, I=2, O=3, U=4
  private static final String VOWELS = "aeiou";

  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter07\\Exercises\\";
    File f = new File(directory, "lengths.txt");

    // check the file exists
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the scanner instance
    Scanner fileScanner = new Scanner(f);

    // 2. Pass the scanner to the method
    int[] lengths = wordLengths(fileScanner);
    printLengths(lengths);

    // 3. Close the scannerFiles
    fileScanner.close();

  }
  public static int[] wordLengths(Scanner input) {

    // check for null input
    if (input == null) {
        throw new IllegalArgumentException("Input cannot be null.");
    }

    // initialize a new array to count word lengths
    int[] counts = new int[81];

    while (input.hasNext()) {
      String token = input.next();
      int tokenLength = token.length();
      counts[tokenLength]++;
    }
    return counts;
  }

  public static void printLengths(int[] lengths) {
    for (int i = 1; i < lengths.length; i++) {
      String rc = String.valueOf('*').repeat(lengths[i]);
      System.out.printf("%2d: %3d %s\n", i, lengths[i], rc);
    }
  }
}
