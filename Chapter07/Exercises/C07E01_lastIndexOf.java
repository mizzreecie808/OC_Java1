/*
Write a method called lastIndexOf that accepts an array of integers and an integer
value as its parameters and returns the last index at which the value occurs in the array.
The method should return –1 if the value is not found.
[74, 85, 102, 99, 101, 85, 56], the last index of the value 85 is 5.

*/
public class C07E01_lastIndexOf {
  public static void main(String[] args) {

    int[] tester = {74, 85, 102, 99, 101, 85, 56};
    int result = lastIndexOf(tester, 85);
    IO.println(result);

  }

  public static int lastIndexOf(int[] nums, int value) {
    int lastIndex = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == value && i > lastIndex) {
        lastIndex = i;
      }
    }
    return lastIndex;
  }
}
