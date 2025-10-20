/*
Write a program that computes a student’s grade in a course. The course grade has
three components: homework assignments, a midterm exam, and a final exam. The
program should prompt the user for all information necessary to compute the grade,
such as the number of homework assignments, the points earned and points possible for
each assignment, the midterm and final exam scores, and whether each exam was curved
(and, if so, by how much).

Consider writing a variation of this program that reports what final exam score the
student needs to get a certain course grade.
*/

import java.util.Scanner;

public class C04PP05_studentsGrade {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    IO.println("Assignment #%d points earned: ".length());
  }

  // prompts for homework
  public static void homework(Scanner console) {
    IO.print("How many homework assignments: ");
    int count = console.nextInt();

    double totalEarned = 0;
    double totalPossible = 0;
    for (int i = 1; i <= count; i++) {
      String earned = String.format("Assignment #%d points earned: ", i);
      String possible = String.format("Assignment #%d points possible: ", i);
      System.out.printf("%-32s", earned);
      double ptEarned = console.nextInt();
      totalEarned += ptEarned;
      System.out.printf("%-32s", possible);
      double ptPossible = console.nextInt();
      totalPossible += ptPossible;
    }

    IO.println("Homework points: " + (totalEarned / totalPossible));
  }



  // prompts for midterm


  // prompts for final exam
}
