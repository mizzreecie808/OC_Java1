/*
Write a method called perfectNumbers that accepts an integer maximum as its parameter
and prints all “perfect numbers” up to and including that maximum. A perfect number
is an integer that is equal to the sum of its proper factors, that is, all numbers that
evenly divide it other than 1 and itself. For example, 28 is a perfect number because
1 + 2 + 4 + 7 + 14 = 28
 The call perfectNumbers(500); should produce the following output:
 Perfect numbers up to 500: 6 28 496
*/
public class C04E21_perfectNumbers {
  public static void main(String[] args) {

    perfectNumbers(500);

  }

  public static void perfectNumbers(int num) {
    String perfect = "";
    for (int i = 1; i <= num; i++) {
      if (checkPerfect(i) == true) {
        perfect += " " + i;
      }
    }
    IO.println("Perfect numbers up to " + num + ":" + perfect);
  }

  public static boolean checkPerfect(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum == num;
  }
}
