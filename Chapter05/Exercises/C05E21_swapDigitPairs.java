/*
Write a method called swapDigitPairs that accepts an integer n as a parameter and returns
a new integer whose value is similar to n's but with each pair of digits swapped in order.
swapDigitPairs(482596) would return 845269.
Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8.
If the number contains an odd number of digits, leave the leftmost digit in its original
place.
swapDigitPairs(1234567) would return 1325476.
You should solve this problem without using a String.
*/

public class C05E21_swapDigitPairs {
  public static void main(String[] args) {

    IO.println(swapDigitPairs(482596));  // 845269
    IO.println(swapDigitPairs(1234567)); // 1325476

  }

  public static int swapDigitPairs(int n) {

    n = Math.abs(n);
    int swapped = 0;

    while (n > 0) {
      int temp1 = n % 10;
      n = n / 10;
      int temp2 = n % 10;
      swapped = swapped + temp2 + temp1;
      IO.println(temp1 + " " + temp2);
      n = n / 10;
    }
    return swapped;
  }
}
