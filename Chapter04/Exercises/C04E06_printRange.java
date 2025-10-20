/*
Write a method called printRange that accepts two integers as arguments
and prints the sequence of numbers between the two arguments, separated by
spaces. Print an increasing sequence if the first argument is smaller than
the second; otherwise, print a decreasing sequence. If the two numbers are
the same, that number should be printed by itself.
*/
public class C04E06_printRange {
  public static void main(String[] args) {

    printRange(2, 7);
    printRange(19, 11);
    printRange(5, 5);

  }

  public static void printRange(int start, int end) {
    String result = "";
    if (start <= end) {
      for (int i = start; i <= end; i++) {
        result += i + " ";
      }
    } else {
      for (int i = start; i >= end; i--) {
        result += i + " ";
      }
    }
    IO.println(result.trim());
  }
}
