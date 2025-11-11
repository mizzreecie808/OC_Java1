/*
Write a method called percentEven that accepts an array of integers as a parameter
and returns the percentage of even numbers in the array as a real number.
*/
import java.util.Arrays;

public class C07E10_percentEven {
  public static void main(String[] args) {

    int[] tester = {6, 2, 9, 11, 3};  // 400.0
    double result = percentEven(tester);
    IO.println(result);
  }

  public static double percentEven(int[] nums) {

    if (nums.length == 0) {
      return 0.0;
    }

    int evens = 0;

    for (int num : nums) {
      if (num % 2 == 0) {
        evens++;
      }
    }
    double percent = evens / (double) nums.length * 100;
    return percent;
  }
}
