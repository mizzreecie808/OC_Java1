/*
Modify your pow method from Exercise 5 to make a new method called pow2 that
uses the type double for the first parameter and that works correctly for negative numbers.

pow2(–4.0, 3) should return –4.0 * –4.0 * –4.0, or –64.0
pow2(4.0, –2) should return 1 / 16, or 0.0625
*/
public class C04E14_pow2 {
  public static void main(String[] args) {

    IO.println(pow2(-4.0, 3));
    IO.println(pow2(4.0, -2));

  }

  public static double pow2(double base, int exponent) {
    return Math.pow(base, exponent);
  }
}
