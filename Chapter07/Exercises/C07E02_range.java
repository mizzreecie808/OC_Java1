/*
Write a method called range that returns the range of values in an array of integers.
The range is defined as 1 more than the difference between the maximum and minimum
values in the array.
[36, 12, 25, 19, 46, 31, 22] the last index of the value 85 is 5.

*/
public class C07E02_range {
  public static void main(String[] args) {

    int[] tester = {36, 12, 25, 19, 46, 31, 22};
    int result = range(tester);
    IO.println(result);

  }

  public static int range(int[] nums) {

    if (nums.length == 0) {
      IO.println("Error: Empty array");
      return -1;
    }

    int min = nums[0];
    int max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return (max - min + 1);
  }
}
