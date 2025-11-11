/*
Write a method called isUnique that accepts an array of integers as a parameter and
returns a boolean value indicating whether or not the values in the array are unique
(true for yes, false for no). The values in the list are considered unique if there
is no pair of values that are equal.
*/
import java.util.Arrays;

public class C07E11_isUnique {
  public static void main(String[] args) {

    int[] testTrue = {3, 8, 12, 2, 9, 17, 43, -8, 46};
    int[] testFalse = {4, 7, 3, 9, 12, -47, 3, 74};
    System.out.println("--- Test True ---");
    System.out.println("Expected: true,  Result: " + isUnique(testTrue));

    System.out.println("--- Test False ---");
    System.out.println("Expected: false, Result: " + isUnique(testFalse));

  }

  public static boolean isUnique(int[] nums) {

    // make a copy first then sort, this way the original array stays in tack
    int[] sorted = Arrays.copyOf(nums, nums.length);
    Arrays.sort(sorted);

    for (int i = 0; i < sorted.length - 1; i++) {
      if (sorted[i] == sorted[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
