/*
Write a method called longestSortSequence that accepts an array of integers as a
parameter and returns the length of the longest sorted (nondecreasing) sequence of
integers in the array.
*/
import java.util.Arrays;

public class C07E13_longestSortSequence {
  public static void main(String[] args) {

    int[] exampleArray = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
    // Expected longest sequence: {-3, 0, 14, 207} -> Length 4
    System.out.println("Test 1: " + Arrays.toString(exampleArray));
    System.out.println("Result (Expected 4): " + longestSortSequence(exampleArray));

    int[] duplicateArray = {1, 2, 2, 3, 1, 4, 5, 5, 5, 6};
    // Expected longest sequence: {4, 5, 5, 5, 6} -> Length 5
    System.out.println("\nTest 2: " + Arrays.toString(duplicateArray));
    System.out.println("Result (Expected 6): " + longestSortSequence(duplicateArray));

    int[] emptyArray = {};
    System.out.println("\nTest 3: Empty Array");
    System.out.println("Result (Expected 0): " + longestSortSequence(emptyArray));

  }

  public static int longestSortSequence(int[] nums) {

    if (nums.length == 0) {
      return 0;
    }

    // 1. track longest run
    int maxLength = 1;

    // 2. track length of sorted run we are currently looking at, resets to 1 when broken
    int currentSequenceLength = 1;

    for (int i = 1; i < nums.length; i++) {

      // check for continuation: is the current element greater than the previous
      if (nums[i] >= nums[i - 1]) {
        currentSequenceLength++;

        // update overall max length
        maxLength = Math.max(maxLength, currentSequenceLength);
      } else {
        // reset to 1
        currentSequenceLength = 1;
      }
    }
    return maxLength;
  }
}
