/*
Write a method called lastDigit that returns the last digit of an integer.
lastDigit(3572) should return 2
lastDigit(-947) should return 7
*/
public class C03E09_lastDigit {
  public static void main(String[] args) {
    lastDigit(3572);
    lastDigit(-947);
  }

  public static int lastDigit(int num) {
    // System.out.println(Math.abs(num % 10));
    return Math.abs(num % 10);
  }
}
