/*
Write a method called hasMidpoint that accepts three integers as parameters and returns
true if one of the integers is the midpoint between the other two integers; that is,
if one integer is exactly halfway between them.
*/


public class C05E14_hasMidPoint {
  public static void main(String[] args) {

    IO.println("---Return True ---");
    IO.println(hasMidpoint(7, 4, 10));
    IO.println(hasMidpoint(4, 4, 4));
    IO.println("---Return False---");
    IO.println(hasMidpoint(9, 15, 8));
  }

  public static boolean hasMidpoint(int a, int b, int c) {

    int min = Math.min(a, Math.min(b, c));
    int max = Math.max(a, Math.max(b, c));
    int mid = (a + b + c) - (max + min);
    return (max - mid) == (mid - min);
  }
}
