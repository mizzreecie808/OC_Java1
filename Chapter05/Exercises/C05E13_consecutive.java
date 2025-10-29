/*
Write a method called consecutive that accepts three integers as parameters and returns
true if they are three consecutive numbers—that is, if the numbers can be arranged into
an order such that, assuming some integer
k, the parameters’ values are k, k + 1, and k + 2
Your method should return false if the integers are not consecutive. Note that order
is not significant; your method should return the same result for the same three integers
passed in any order.
*/


public class C05E13_consecutive {
  public static void main(String[] args) {

    IO.println("---Return True ---");
    IO.println(consecutive(1, 2, 3));
    IO.println(consecutive(3, 2, 4));
    IO.println(consecutive(-10, -8, -9));
    IO.println("---Return False---");
    IO.println(consecutive(3, 5, 7));
    IO.println(consecutive(1, 2, 2));
    IO.println(consecutive(7, 7, 9));
  }

  public static boolean consecutive(int a, int b, int c) {

    int min = Math.min(a, Math.min(b, c));
    int max = Math.max(a, Math.max(b, c));
    boolean diff = Math.abs(min - max) == 2;
    boolean noEqual = a != b && b != c && a != c;
    return diff && noEqual;
  }
}
