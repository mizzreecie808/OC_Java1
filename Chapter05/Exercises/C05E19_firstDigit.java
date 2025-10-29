/*
Write a method called firstDigit that returns the first (most significant) digit of an
integer.
firstDigit(3572) should return 3
firstDigit(-947) should return 9
*/

public class C05E19_firstDigit {
  public static void main(String[] args) {

    IO.println(firstDigit(3572));
    IO.println(firstDigit(-947));
  }

  public static int firstDigit(int n) {

    int temp = 0;
    n = Math.abs(n);
    while (n > 1) {
      temp = n % 10;
      n = n / 10;
    }
    return temp;
  }
}
