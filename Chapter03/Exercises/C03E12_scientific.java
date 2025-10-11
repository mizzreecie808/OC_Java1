/*
Write a method called scientific that accepts a real number base and an
exponent as parameters and computes the base times 10 to the exponent,
as seen in scientific notation
scientific(6.23, 5) would return 623000.0
scientific(1.9, –2) would return 0.019
*/
public class C03E12_scientific {
  public static void main(String[] args) {
    scientific(6.23, 5);
    scientific(1.9, -2);
  }

  public static double scientific(double base, int exponent) {
    double base10 = Math.pow(10, exponent);
    System.out.println(base10 * base);
    return base10 * base;
  }
}
