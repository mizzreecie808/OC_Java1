/*
Write a method called monthApart that accepts four integer parameters,
m1, d1, m2, and d2 representing two calendar dates.
Each date consists of a month (1 through 12) and a day (1 through the number of days in
that month [28–31]). Assume that all parameter values passed are valid.
The method should return true if the dates are at least a month apart and false otherwise.
For example, the call of monthApart(4, 15, 5, 22) would return true while the call of
monthApart(9, 19, 10, 17) would return false. Assume that all the dates in this problem
occur during the same year. Note that the first date could come before or after the second
date.
*/


public class C05E17_monthApart {
  public static void main(String[] args) {

    IO.println("---Return True ---");
    IO.println(monthApart(4, 15, 5, 22));
    IO.println(monthApart(3, 15, 5, 22));

    IO.println("---Return False---");
    IO.println(monthApart(9, 19, 10, 17));
    IO.println(monthApart(9, 21, 10, 17));
  }

  public static boolean monthApart(int m1, int d1, int m2, int d2) {

    // 1. check if same month
    if (m1 == m2) {
      return false;
    }
    // 2. check if 2 months or greater apart
    if (Math.abs(m1 - m2) > 1) {
      return true;
    }
    // 3. check for the day difference
    if (m1 > m2) {
      return d1 - d2 >= 0;
    }
    return d2 - d1 >= 0;
  }
}
