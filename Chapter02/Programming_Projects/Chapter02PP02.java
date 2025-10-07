/*
Write a program that produces the following output using nested for loops:
+------+
|  ^^  |
| ^  ^ |
|^    ^|
|  ^^  |
| ^  ^ |
|^    ^|
+------+
|v    v|
| v  v |
|  vv  |
|v    v|
| v  v |
|  vv  |
+------+
See OneNote for loop limit table
*/

public class Chapter02PP02 {

  public static int SIZE = 3;

  public static void main(String[] args) {
    topHalf();

  }

  public static void topHalf() {

    for (int line = 1; line <= SIZE; line++) {
      // draw outer pipe (|)
      System.out.print("|");
      int outerSpace = SIZE - line;
      int innerSpace = 2 * line - 2 ;

      // draw outer spaces limit = SIZE - line
      for (int i = 1; i <= outerSpace; i++) {
        System.out.print(" ");
      }
      System.out.print("^");
      // draw inner spaces limit = 2 * line - 2
      for (int i = 1; i <= innerSpace; i++) {
        System.out.print(" ");
      }
      System.out.print("^");
      // draw outer spaces limit = SIZE - line
      for (int i = 1; i <= outerSpace; i++) {
        System.out.print(" ");
      }
      System.out.print("|");
      System.out.println();
    }
  }
}
