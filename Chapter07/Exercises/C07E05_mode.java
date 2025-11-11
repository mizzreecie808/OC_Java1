/*
Write a method called mode that returns the most frequently occurring element of an
array of integers. Assume that the array has at least one element and that every element
in the array has a value between 0 and 100 inclusive. Break ties by choosing the
lower value.

*/
import java.util.Arrays;

public class C07E05_mode {
  public static void main(String[] args) {

    int[] list = {27, 15, 15, 11, 27};
    IO.println(mode(list));

  }

  public static int mode(int[] nums) {

    // check for null or empty arrays
    if (nums == null || nums.length == 0) {
      throw new IllegalArgumentException("Array cannot be null.");
    }

    if (nums.length == 1) {
      return nums[0];
    }

    // create a tally array to keep count
    int[] counts = new int[101];

    for (int num : nums) {
      if (num >= 0 && num <= 100) {
        counts[num]++;
      }
    }

    int maxCount = 0;
    int mode = 0;

    for (int i = 0; i < counts.length; i++) {
      if(counts[i] > maxCount) {
        maxCount = counts[i];
        mode = i;
      }
    }
    return mode;
  }
}
