/*
Write a method called dominant that accepts three integers as parameters and returns
true if any one of the three integers is larger than the sum of the other two integers.
The integers might be passed in any order, so the largest value could be any of the three.
For example, the call dominant(4, 9, 2) returns true because 9 is larger than 4 + 2
Assume that none of the numbers is negative.
*/


public class C05E15_dominant {
  public static void main(String[] args) {

    IO.println("---Return True ---");
    IO.println(dominant(4, 9, 2));
    IO.println(dominant(4, 10, 1));
    IO.println("---Return False---");
    IO.println(dominant(9, 7, 8));
  }

  public static boolean dominant(int a, int b, int c) {

    int min = Math.min(a, Math.min(b, c));
    int max = Math.max(a, Math.max(b, c));
    int mid = (a + b + c) - (max + min);
    return max > (mid + min);
  }
}
