/*
Write a method called evenSumMax that accepts a Scanner for the console as a parameter.
The method should prompt the user for a number of integers, then prompt the integer
that many times. Once the user has entered all the integers, the method should print the
sum of all the even numbers the user typed, along with the largest even number typed.
You may assume that the user will type at least one nonnegative even integer.
*/
import java.util.Scanner;

public class C04E10_printGPA {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    printGPA(console);
  }

  public static void printGPA(Scanner console) {

    IO.print("Enter a student record: ");
    String name = console.next();
    int scoreCount = console.nextInt();
    double totalPoints = 0.0;

    for (int i = 1; i <= scoreCount; i++) {
      double nextGrade = (double) console.nextInt();
      totalPoints += nextGrade;
    }
    double gpa = totalPoints / scoreCount;

    IO.println(name + "'s grade is " + gpa);
  }
}
