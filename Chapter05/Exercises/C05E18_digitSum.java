/*
Write a method called digitSum that accepts an integer as a parameter and returns the
sum of the digits of that number. For example, the call digitSum(29107) returns
digitSum(29107) returns 2 + 9 + 1 + 0 + 7 = 19
For negative numbers, return the same value that would result if the number were positive. For example, digitSum(-456) returns
digitSum(-456) returns 4 + 5 + 6 = 15
digitSum(0) returns 0
*/

public class C05E18_digitSum {
  public static void main(String[] args) {

    IO.println(digitSum(29107));
    IO.println(digitSum(-456));
    IO.println(digitSum(0));
  }

  public static int digitSum(int n) {

    int sum = 0;
    n = Math.abs(n);
    while (n > 0) {
      int temp = n % 10;
      sum += temp;
      n = n / 10;
    }
    return sum;
  }
}
