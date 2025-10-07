/*
Write a program that produces the following hourglass figure as its output
using nested for loops:
|""""""""""|
 \::::::::/
  \::::::/
   \::::/
    \::/
     ||
    /::\
   /::::\
  /::::::\
 /::::::::\
|""""""""""|
*/

public class Chapter02PP04 {

  public static int SIZE = 5;
  public static void main(String[] args) {
    // line();
    // System.out.println();
    // topHalf();
    // center();
    // bottomHalf();
    // line();
  }

  public static void line() {
    System.out.print("|");
    for (int i = 1; i <= 2 * SIZE; i++) {
      System.out.print("\"");
    }
    System.out.print("|");
  }

  public static void topHalf() {

    // outer loop from line 1 to SIZE - 1 (1 to 4)
    for (int line = 1; line <= SIZE - 1; line++) {

      // inner loop: spaces loop limit = 4
      for (int i = 1; i <= line; i++) {
        System.out.print(" ");
      }

      // print backslash
      System.out.print("\\");

      // inner loop: colons loop limit = 2 * SIZE - 2 * line
      int colonCount = 2 * SIZE - 2 * line;
      for (int i = 1; i <= colonCount; i++) {
        System.out.print(":");
      }

      // print forward slash
      System.out.print("/");
      System.out.println();
    }
  }

  public static void bottomHalf() {

      // outer loop from line 1 to SIZE - 1 (1 to 4) same as top half
      for (int line = 1; line <= SIZE - 1; line++) {

        // inner loop: spaces loop limit = SIZE (4, 3, 2, 1)
        int spaceCount = SIZE - line;
        for (int i = 1; i <= spaceCount; i++) {
          System.out.print(" ");
        }

        // print forward slash
        System.out.print("/");

        // inner loop: colons loop limit = 2 * line (2, 4, 6, 8)
        int colonCount = 2 * line;
        for (int i = 1; i <= colonCount; i++) {
          System.out.print(":");
        }

        // print backslash
        System.out.print("\\");
        System.out.println();
      }
  }

  public static void center() {
    // spaces: loop limit = SIZE
    for (int i = 1; i <= SIZE; i++) {
      System.out.print(" ");
    }
    // print pipes
    System.out.print("||");
    System.out.println();
  }
}
