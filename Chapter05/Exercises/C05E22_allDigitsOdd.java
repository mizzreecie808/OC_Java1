/*
Write a method called allDigitsOdd that returns whether every digit of a positive
integer is odd. Return true if the number consists entirely of odd digits (1, 3, 5, 7, 9)
and false if any of its digits are even (0, 2, 4, 6, 8).
allDigitsOdd(135319) returns true
allDigitsOdd(9145293) returns false
*/

public class C05E22_allDigitsOdd {
  public static void main(String[] args) {

    IO.println(allDigitsOdd(135319));
    IO.println(allDigitsOdd(9145293));

  }

  public static boolean allDigitsOdd(int n) {

    while (n > 0) {
      int temp = n % 10;
      if (temp % 2 == 0) {
        return false;
      }
      n = n / 10;
    }
    return true;
  }
}
