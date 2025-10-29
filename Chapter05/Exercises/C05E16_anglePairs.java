/*
Write a method called anglePairs that accepts three angles (integers), measured in degrees,
as parameters and returns whether or not there exist both complementary and supplementary
angles among the three angles passed. Two angles are complementary if their sum is exactly
90 degrees; two angles are supplementary if their sum is exactly 180 degrees. Therefore,
the method should return true if any two of the three angles add up to 90 degrees and also
any two of the three angles add up to 180 degrees.
anglePairs(120, 60, 30) returns true.
Assume that each angle passed is nonnegative.
*/


public class C05E16_anglePairs {
  public static void main(String[] args) {

    IO.println("---Return True ---");
    IO.println(anglePairs(120, 60, 30));
    IO.println(anglePairs(140, 40, 50));

    IO.println("---Return False---");
    IO.println(anglePairs(100, 80, 5));
  }

  public static boolean anglePairs(int a, int b, int c) {

    int sum1 = a + b;
    int sum2 = b + c;
    int sum3 = c + a;
    boolean ninety = sum1 == 90 || sum2 == 90 || sum3 == 90;
    boolean oneEighty = sum1 == 180 || sum2 == 180 || sum3 == 180;
    return ninety && oneEighty;
  }
}
