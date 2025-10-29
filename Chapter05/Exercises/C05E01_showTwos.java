/*
Write a method called showTwos that shows the factors of 2 in a given integer.
*/
public class C05E01_showTwos {
  public static void main(String[] args) {

    showTwos(7);
    showTwos(18);
    showTwos(68);
    showTwos(120);

  }

  public static void showTwos(int num) {
    IO.print(num + " = ");

    // use a working variable to preserve the original num
    int currNum = num;

    while (currNum % 2 == 0) {
      IO.print(2 + " * ");
      currNum /= 2;
    }
    IO.print(currNum);
    IO.println();
  }
}
