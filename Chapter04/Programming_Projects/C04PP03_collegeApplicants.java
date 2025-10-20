/*
Write a program that prompts for a number and displays it in Roman numerals.
*/

import java.util.Scanner;

public class C04PP03_collegeApplicants {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    applicants(console);
  }

  public static String applicants(Scanner console) {
    double student1 = calculateScore(console, 1);
    double student2 = calculateScore(console, 2);

    if (student1 > student2) {
      return "Student 1 is more qualified";
    } else if (student2 > student1) {
      return "Student 2 is more qualified";
    } else {
      return "Students are equally qualified";
    }
  }

  public static double calculateScore(Scanner console, int studentNum) {
    // Use student number to customize the prompt
    IO.print("Student #" + studentNum + " GPA: ");
    double gpa = console.nextDouble();
    IO.print("Student #" + studentNum + " SAT: ");
    double sat = console.nextDouble();
    IO.print("Student #" + studentNum + " ACT: ");
    double act = console.nextDouble();

    return gpa + sat + act;
  }
}
