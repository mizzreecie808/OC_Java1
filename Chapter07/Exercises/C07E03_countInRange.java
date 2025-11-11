/*
Write a method called countInRange that accepts an array of integers, a minimum value,
and a maximum value as parameters and returns the count of how many elements from the
array fall between the minimum and maximum (inclusive).
[14, 1, 22, 17, 36, 7, -43, 5] returns 4

*/
import java.util.Arrays;

public class C07E03_countInRange {
  public static void main(String[] args) {

    int[] tester = {14, 1, 22, 17, 36, 7, -43, 5};
    int result = countInRange(tester, 4, 17);
    IO.println(result);

  }

  public static int countInRange(int[] nums, int min, int max) {

    if (nums.length == 0) {
      IO.println("Error: Empty array");
      return -1;
    }

    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= min && nums[i] <= max) {
        count++;
      }
    }
    return count;
  }
}
