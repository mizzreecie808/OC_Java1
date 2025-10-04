/*
Write a method called printDesign that produces the following output.
Use nested for loops to capture the structure of the figure.
-----1-----
----333----
---55555---
--7777777--
-999999999-
See Self_Check\Exercises printDesign.txt
*/
public class Chapter02Exercise15 {
  public static final int SIZE = 3;

  public static void main(String[] args) {

    printNumbers();

  }
  public static void printNumbers() {
    // outer loop for line 1 to SIZE
    for (int line = 1; line <= SIZE; line++) {

      // calculate the digit and hyphen count
      int hyphen = SIZE + 1 - line;
      int digit = 2 * line - 1;

      // inner loop to print hyphens
      for (int i = 1; i <= hyphen; i++) {
        System.out.print("-");
      }

      // inner loop to print digits
      for (int i = 1; i <= digit; i++) {
          System.out.print(digit);
      }

      // inner loop to print hyphens again
      for (int i = 1; i <= hyphen; i++) {
        System.out.print("-");
      }
      // print a new line
      System.out.println();
    }
  }
}
