/*
Write a method called gcd that accepts two integers as parameters and returns the greatest
common divisor (GCD) of the two numbers. The GCD of two integers a and b is the largest
integer that is a factor of both a and b.

One efficient way to compute the GCD of two numbers is to use Euclid’s algorithm,
which states the following:
GCD(a, b) = GCD(b, a % b);
GCD(a, 0) = Absolute value of a
*/
public class C05E02_gcd {
  public static void main(String[] args) {

    IO.println("GCD(45, 18) = " + gcd(45, 18));    // Expected: 9
    IO.println("GCD(180, 12) = " + gcd(180, 12));  // Expected: 12
    IO.println("GCD(78, 13) = " + gcd(78, 13));    // Expected: 13
    IO.println("GCD(48, 35) = " + gcd(48, 35));    // Expected: 1
    IO.println("GCD(25, 0) = " + gcd(25, 0));      // Expected: 25
    IO.println("GCD(0, 50) = " + gcd(0, 50));      // Expected: 50 (testing absolute value rule)
  }

  public static int gcd(int a, int b) {

    a = Math.abs(a);
    b = Math.abs(b);

    // Euclid's algorithm: GCD(a, b) = GCD(b, a % b)
    // This loop continues as long as b (the remainder from the previous step) is NOT zero.
    while (b != 0) {
      // 1) calculate the remainder (a % b)
      int remainder = a % b;

      // 2) the old b becomes the new a
      a = b;

      // 3) the remainder becomes the new b
      b = remainder;
    }
    // When the loop terminates, the value of a is the GCD
    return a;
  }
}
