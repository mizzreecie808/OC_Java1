/*
Write a method called hasAnOddDigit that returns whether a given positive integer has
at least one digit whose value is odd. Return true if the number has at least one odd
digit and false if none of its digits are odd.
hasAnOddDigit(4822116) should return true
hasAnOddDigit(2448) should return false
*/

public class C05E23_hasAnOddDigit {
  public static void main(String[] args) {

    IO.println(hasAnOddDigit(4822116));
    IO.println(hasAnOddDigit(2448));

  }

  public static boolean hasAnOddDigit(int n) {

    while (n > 0) {
      int temp = n % 10;
      if (temp % 2 == 1) {
        return true;
      }
      n = n / 10;
    }
    return false;
  }
}
