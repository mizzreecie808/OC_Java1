/*
Write a method called longestName that accepts a Scanner for the console
and an integer n as parameters and prompts for n names, then prints the
longest name (the name that contains the most characters) in the format shown
below, which might result from a call of longestName(console, 4):
*/

import java.util.Scanner;

public class C04E11_longestName {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    longestName(console, 4);
    IO.println("Stefanie's name is longest.");

  }

  public static void longestName(Scanner console, int n) {

    // expected IllegalArgumentException
    // checking that the console != null
    if (console == null) {
      throw new IllegalArgumentException("Scanner cannot be null.");
    }

    // validates that n is greater than 0
    if (n <= 0) {
      // tester requires THROWing an exception, not just printing
      throw new IllegalArgumentException("Names (n) must be greather than 0.");
    }

    // read the first name
    IO.print("name #1? ");
    String longestName = console.next();
    int letterCount = longestName.length();

    for (int i = 2; i <= n; i++) {

      IO.print("name #" + i + "? ");
      String currName = console.next();
      int currCount = currName.length();

      if (currCount > letterCount) {
        letterCount = currCount;
        longestName = currName;
      }
    }

    // Make resulting string in CapitalCase
    String result = "";
    if (longestName.length() > 0) {
      result = longestName.substring(0, 1).toUpperCase() +
                longestName.substring(1).toLowerCase();
    }
    IO.println(result + "'s name is longest");
  }
}
