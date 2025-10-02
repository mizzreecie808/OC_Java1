/*
Write a for loop that computes and prints the first 12 Fibonacci numbers.
1 1 2 3 5 8 13 21 34 55 89 144
*/
public class Chapter02Exercise03 {
  public static void main(String[] args) {
    int previous = 1;   // first in fib
    int current = 1;    // second in fib

    System.out.print(previous + ", " + current);

    for (int i = 1; i <= 10; i++) {
      // initialize and assign next
      int next = previous + current;

      System.out.print(", " + next);

      // update previous and current variables
      previous = current;
      current = next;
    }
  }
}
