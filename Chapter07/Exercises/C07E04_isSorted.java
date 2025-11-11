/*
Write a method called isSorted that accepts an array of real numbers as a parameter
and returns true if the list is in sorted (nondecreasing) order and false otherwise.
[14, 1, 22, 17, 36, 7, -43, 5] returns 4

*/
import java.util.Arrays;

public class C07E04_isSorted {
  public static void main(String[] args) {

    double[] list1 = {16.1, 12.3, 22.2, 14.4};
    double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
    IO.println(isSorted(list1));
    IO.println(isSorted(list2));

  }

  public static boolean isSorted(double[] nums) {

    if (nums.length <= 1) {
      return true;
    }

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] >= nums[i + 1]) {
        // immediately terminate the loop
        return false;
      }
    }
    // if you made it this far then the arrray is in order
    return true;
  }
}
