/*
Write a method called kthLargest that accepts an integer k and an array a as its
parameters and returns the element such that k elements have greater or equal value.
If k = 0, return the largest element;
if k = 1, return the second-largest element, and so on.
[74, 85, 102, 99, 101, 56, 84] and k = 2, return 99
because there are two values at least as large as 99 (101 and 102).
Assume that 0 ≤ k < a.length.
(Hint: Consider sorting the array or a copy of the array first.)
*/
import java.util.Arrays;

public class C07E07_kthLargest {
  public static void main(String[] args) {

    int[] tester = {74, 85, 102, 99, 101, 56, 84};
    int result = kthLargest(tester, 2);
    IO.println(result);
  }

  public static int kthLargest(int[] nums, int k) {

    if (nums.length == 0) {
      IO.println("Error: Empty array");
      return -1;
    }

    // make a copy first then sort, this way the original array stays in tack
    int[] sorted = Arrays.copyOf(nums, nums.length);
    Arrays.sort(sorted);

    return sorted[sorted.length - k - 1];
  }
}
