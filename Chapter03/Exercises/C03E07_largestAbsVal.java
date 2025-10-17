/*
Write a variation of the largestAbsVal method from the last exercise
that takes three integers as parameters and returns the largest of their
three absolute values.
largestAbsVal(7, –2, –11) would return 11
largestAbsVal(-4, 5, 2) would return 5.
*/
public class C03E07_largestAbsVal {
  public static void main(String[] args) {
    largestAbsVal(7, -2, -11);
    largestAbsVal(-4, 5, 2);
  }

  public static int largestAbsVal(int num1, int num2, int num3) {
    int max1 = Math.max(Math.abs(num1), Math.abs(num2));
    int result = Math.max(max1, Math.abs(num3));
    System.out.println(result);
    return result;
  }
}
