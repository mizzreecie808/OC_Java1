/*
Write a method called boyGirl that accepts a Scanner that is reading its input from a
file containing a series of names followed by integers. The names alternate between boys’
names and girls’ names. Your method should compute the absolute difference between the sum
of the boys’ integers and the sum of the girls’ integers. The input could end with either
a boy or girl; you may not assume that it contains an even number of names.
*/

import java.io.*;
import java.util.*;

public class C06E01_boyGirl {
  public static void main(String[] args) throws FileNotFoundException {

    String directory = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";
    File f = new File(directory, "names.txt");
    boyGirl(f);

  }

  public static void boyGirl(File f) throws FileNotFoundException {

    // ensure the file is present
    if (!f.canRead()) {
      IO.println("No valid file found, exiting program.");
    }

    int boySum = 0, girlSum = 0, boyCount = 0, girlCount = 0, index = 0;

    Scanner input = new Scanner(f);

    while (input.hasNext()) {
      String name = input.next();
      if (input.hasNextInt()) {
        // read the score
        int score = input.nextInt();

        // boys are on even index 0, 2, 4
        if (index % 2 == 0) {
          boySum += score;
          boyCount++;

        // girls are on odd index 1, 3, 5
        } else {
          girlSum += score;
          girlCount++;
        }

        // increase index
        index++;
      }
    }
    int difference = Math.abs(boySum - girlSum);
    IO.println(boyCount + " boys, " + girlCount + " girls");
    IO.println("Difference between boys' and girls' sums: " + difference);
  }
}
