/*
Write a method called digitRange that accepts an integer as a parameter and returns the
range of values of its digits. The range is defined as 1 more than the difference between
the largest and smallest digit value.
digitRange(68437) would return 6 because
the largest digit value is 8 and the smallest is 3, 8 - 3 + 1 = 6
 If the number contains only one digit, return 1.
 You should solve this problem without using a String.
*/

public class C05E20_digitRange {
  public static void main(String[] args) {

    IO.println(digitRange(68437));  // 6
    IO.println(digitRange(102));    // 3
    IO.println(digitRange(6));      // 1
  }

  public static int digitRange(int n) {

    n = Math.abs(n);

    // initialize min/max
    int min = 9;
    int max = 0;

    while (n > 0) {
      int temp = n % 10;

      // update the min/max
      if (temp > max) {
        max = temp;
      }
      if (temp < min) {
        min = temp;
      }
      n = n / 10;
    }
    return max - min + 1;
  }
}
