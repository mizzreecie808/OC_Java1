/*
Write a method called evenSumMax that accepts a Scanner for the console as a parameter.
The method should prompt the user for a number of integers, then prompt the integer
that many times. Once the user has entered all the integers, the method should print the
sum of all the even numbers the user typed, along with the largest even number typed.
You may assume that the user will type at least one nonnegative even integer.
*/
import java.util.Scanner;

public class C04E09_evenSumMax {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    evenSumMax(console);
  }

  public static void evenSumMax(Scanner console) {

    IO.print("How many integers? ");
    int count = console.nextInt();
    int evenSum = 0;
    int evenMax = 0;

    for (int i = 1; i <= count; i++) {
      IO.print("Next integer? ");
      int currUser = console.nextInt();
      if (currUser % 2 == 0) {
        evenSum += currUser;
        if (currUser > evenMax) {
          evenMax = currUser;
        }
      }
    }

    IO.println("Even sum = " + evenSum + ", Even max = " + evenMax);
  }
}
