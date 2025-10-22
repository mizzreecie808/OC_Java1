/*
Write a method called average that takes two integers as parameters and returns the
average of the two integers.
*/

public class C04E13_average {
  public static void main(String[] args) {

    IO.println(average(2, 10));
    IO.println(average(3, 4));

  }

  // 4.18 wordCount Error on invalid parameter
  public static double average(int a, int b) {
    return (a + b) / 2.0;
  }
}
