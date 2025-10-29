/*
Write a method called diceSum that accepts a Scanner for the console as a parameter and
prompts for a desired sum, then repeatedly simulates the rolling of 2 six-sided dice until
their sum is the desired sum. Here is a sample dialogue with the user:
Desired dice sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9
*/

import java.util.*;

public class C05E07_diceSum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    diceSum(sc);

  }

  public static void diceSum(Scanner sc) {

    // Random object initialization
    Random r = new Random();

    // number to hit
    IO.print("Desired dice sum: ");
    int desiredSum = sc.nextInt();
    int d1, d2;

    // use do/while loop so that loop is executed at least once
    int diceSum = 0;

    // no increment or decrement needed because this will end when diceSum == desiredSum
    do {
      d1 = r.nextInt(6) + 1;
      d2 = r.nextInt(6) + 1;
      diceSum = d1 + d2;
      IO.println(d1 + " and " + d2 + " = " + diceSum);
    } while (diceSum != desiredSum);
  }
}
