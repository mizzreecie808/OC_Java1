/*
Write a method called printAverage that uses a sentinel loop to repeatedly prompt the
user for numbers. Once the user types any number less than zero, the method should
display the average of all nonnegative numbers typed. Display the average as a double.
Here is a sample dialogue with the user:
Type a number: 7
Type a number: 4
Type a number: 16
Type a number: –4
Average was 9.0
*/
import java.util.Scanner;

public class C05E12_printAverage {
  public static void main(String[] args) {

    printAverage();
  }

  public static void printAverage() {

    Scanner sc = new Scanner(System.in);
    int input;
    double sum = 0.0;
    int count = 0;

    String prompt = "Type a number: ";
    String wholeNumber = " (Input must be a whole number)\n" + prompt;

    while (true) {
      IO.print(prompt);

      while (!sc.hasNextInt()) {
        sc.next();
        IO.print(wholeNumber);
      }

      // read the next valid input
      input = sc.nextInt();


      // sentinel check: if negative, break the loop immediately
      if (input < 0) {
        break;
      }

      // process valid input
      sum += input;
      count++;
    }

    if (count == 0) {
      // do nothing
    } else {
      double average = sum / count;
      IO.println("Average was " + average);
    }
  }
}
