/*
Write a method called median that accepts an array of integers as its parameter and
returns the median of the numbers in the array. The median is the number that appears
in the middle of the list if you arrange the elements in order. Assume that the array
is of odd size (so that one sole element constitutes the median) and that the numbers
in the array are between 0 and 99 inclusive.
*/
import java.util.Arrays;

public class C07E08_median {
  public static void main(String[] args) {

    int[] tester1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};  // 5
    int result1 = median(tester1);
    IO.println(result1);

    int[] tester2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};  // 25
    int result2 = median(tester2);
    IO.println(result2);
  }

  public static int median(int[] nums) {

    if (nums.length == 0) {
      IO.println("Error: Empty array");
      return -1;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    // make a copy first then sort, this way the original array stays in tack
    int[] sorted = Arrays.copyOf(nums, nums.length);
    Arrays.sort(sorted);
    return sorted[sorted.length / 2];
  }
}
