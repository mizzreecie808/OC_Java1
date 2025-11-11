import java.util.Arrays;

public class C07_reading {

  public static void main(String[] args) {

    int[] nums = {3, 8, 9, 7, 5};

    int[] leftNums = Arrays.copyOf(nums, nums.length);
    int[] rightNums = Arrays.copyOf(nums, nums.length);
    rotateLeft(leftNums);
    rotateRight(rightNums);
    IO.println("--- Original Array ---");
    IO.println(Arrays.toString(nums));
    IO.println("---  Shifted Left ---");
    IO.println(Arrays.toString(leftNums));
    IO.println("---  Shifted Right ---");
    IO.println(Arrays.toString(rightNums));

  }

  public static void rotateLeft(int[] arr) {
    int first = arr[0];

    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = first;
  }

  public static void rotateRight(int[] arr) {
    int last = arr[arr.length - 1];

    for (int i = arr.length - 1; i >= 1; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = last;
  }
}
