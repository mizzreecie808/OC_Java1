/*
Write a method called pow that accepts a base and an exponent as parameters
and returns the base raised to the given power.
pow(3, 4) should return 3 * 3 * 3 * 3, or 81.
Assume that the base and exponent are nonnegative.
*/
public class C04E05_pow {
  public static void main(String[] args) {

    IO.println(pow(3, 4));

  }

  public static double pow(int base, int exponent) {
    return Math.pow(base, exponent);
  }
}
