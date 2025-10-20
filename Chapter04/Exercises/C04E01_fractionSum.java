/*
Write a method called fractionSum that accepts an integer parameter n
and returns as a double the sum of the first n terms of the sequence
You may assume that the parameter n is nonnegative.
*/
public class C04E01_fractionSum {
  public static void main(String[] args) {
    fractionSum(5);
    fractionSum(3);

  }

  public static double fractionSum(int n) {
    double sum = 1.0;
    for (int i = 2; i <= n; i++) {
      sum += (1.0 / i);
    }
    IO.println(sum);
    return sum;
  }
}
