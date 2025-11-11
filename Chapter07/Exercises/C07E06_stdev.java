/*
Write a method called stdev that returns the standard deviation of an array of integers.
Standard deviation is computed by taking the square root of the sum of the squares of
the differences between each element and the mean, divided by one less than the number
of elements.
Uses the formula: sqrt( sum( (xi - mean)^2 ) / (N-1) )
1) Find the mean - average of all numbers - needed to measure distance from it
2) Find the squared differences - for every number, subtract the mean, then square it
3) Find the mean of the squares - sum #2 above then divide by the data points (variance)
4) Take the square root of #3
*/
import java.util.Arrays;

public class C07E06_stdev {
  public static void main(String[] args) {

    int[] tester = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
    double result = stdev(tester);
    IO.println(result);
  }

  public static double stdev(int[] nums) {

    if (nums.length == 0) {
      IO.println("Error: Empty array");
      return -1.0;
    }

    double mean = Arrays.stream(nums).sum() / (double) nums.length;
    double sqDiff = 0.0;

    for (int i = 0; i < nums.length; i++) {
      double temp = Math.pow((nums[i] - mean), 2);
      sqDiff += temp;
    }

    double variance = sqDiff / (nums.length - 1);
    return Math.sqrt(variance);
  }
}
