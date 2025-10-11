/*
Write a method called largerAbsVal that takes two integers as parameters
and returns the larger of the two absolute values.
largerAbsVal(11, 2) would return 11
largerAbsVal(4, –5) would return 5.
*/
public class C03E06_largerAbsVal {
  public static void main(String[] args) {
    largerAbsVal(11, 2);
    largerAbsVal(4, -5);
  }

  public static int largerAbsVal(int num1, int num2) {
    int result = Math.max(Math.abs(num1), Math.abs(num2));
    // System.out.println(result);
    return result;
  }
}
