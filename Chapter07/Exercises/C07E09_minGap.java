/*
Write a method called minGap that accepts an integer array as a parameter and returns
the minimum difference or gap between adjacent values in the array, where the gap is
defined as the later value minus the earlier value.
*/
import java.util.Arrays;

public class C07E09_minGap {
  public static void main(String[] args) {

    int[] tester = {1, 3, 6, 7, 12};  // 1
    int result = minGap(tester);
    IO.println(result);
  }

  public static int minGap(int[] nums) {

    if (nums.length == 0) {
      IO.println("Error: Empty array");
      return -1;
    }

    int arrLength = nums.length;

    if (arrLength == 1 || arrLength == 2) {
      return 0;
    }

    int minDiff = Integer.MAX_VALUE;
    for (int i = 0; i < arrLength - 1; i++) {
      int temp = nums[i + 1] - nums[i];
      if (temp < minDiff) {
        minDiff = temp;
      }
    }
    return minDiff;
  }
}
