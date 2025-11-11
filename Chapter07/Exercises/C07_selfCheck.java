import java.util.Arrays;

public class C07_selfCheck {
  public static void main(String[] args)  {

    int[] x = {1, 2, 3, 4};
    Arrays.stream(x).forEach(IO::println);
  }

  // 3. create an array of ints of size 5
  public static void createArray() {
    int[] data = {27, 51, 33, -1, 101};
  }

  // 4. store all odd numbers between -6 and 38 into an array using a loop
  public static void oddArray(int startNum, int endNum) {

    if (startNum % 2 == 0) {
      startNum++;
    }

    if (endNum % 2 == 0) {
      endNum--;
    }

    int total = Math.abs(startNum - endNum) / 2;
    int[] general = new int[total];

    for (int i = 0, j = startNum; i < total && j <= endNum; i++, j+=2) {
      general[i] = j;
    }

    IO.println(Arrays.toString(general));
  }

  // chpater text
  public static int[] buildOddArray(int size) {
    int[] data = new int[size];
    for (int i = 0; i < data.length; i++) {
      data[i] = 2 * i + 1;
    }
    return data;
  }
  // memory efficient
  public static void reverseInPlace(int[] arr) {

    int left = 0;
    int right = arr.length - 1;

    // loop until the pointers meet or cross
    while (left < right) {
      // 1. store the value at the left pointer
      int temp = arr[left];

      // 2. overwrite the left value with the right value
      arr[left] = arr[right];

      // 3. overwrite the right value with the temp value
      arr[right] = temp;

      // 4. move the pointers toward the center
      left++;
      right--;
    }
  }
}
