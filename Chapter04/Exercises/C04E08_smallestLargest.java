/*
Write a method called smallestLargest that accepts a Scanner for the
console as a parameter and asks the user to enter numbers, then prints
the smallest and largest of all the numbers supplied by the user.
You may assume that the user enters a valid number greater than 0 for
the number of numbers to read.
*/
import java.util.Scanner;

public class C04E08_smallestLargest {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    smallestLargest(console);
  }

  public static void smallestLargest(Scanner console) {

    IO.print("How many numbers do you want to enter? ");
    int count = console.nextInt();
    int smallest = 0;
    int largest = 0;

    for (int i = 1; i <= count; i++) {
      System.out.printf("Number %s: ", i);
      int currUser = console.nextInt();
      if (currUser > largest) {
        largest = currUser;
      }
      if (currUser < smallest) {
        smallest = currUser;
      }
    }

    IO.println("Smallest = " + smallest);
    IO.println("Largest  = " + largest);
  }
}
