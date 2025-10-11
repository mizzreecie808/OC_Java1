/*
Write a method called quadratic that solves quadratic equations and prints
their roots. Recall that a quadratic equation is a polynomial equation in
terms of a variable x
Your method should accept the coefficients a, b, c
as parameters and should print the roots of the equation. You may assume
that the equation has two real roots, though mathematically this is not
always the case.
*/
public class C03E08_quadratic {
  public static void main(String[] args) {
    quadratic(1, -7, 12);
  }

  public static void quadratic(int a, int b, int c) {
    double topMinus = -b - Math.sqrt(b * b - 4 * a * c);
    double topPlus = -b + Math.sqrt(b * b - 4 * a * c);
    double bottom = 2 * a;
    double x1 = topMinus / bottom;
    double x2 = topPlus / bottom;
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
  }
}
