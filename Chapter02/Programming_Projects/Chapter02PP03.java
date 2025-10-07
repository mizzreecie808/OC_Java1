/*
Write a program that produces the following output using nested for loops:

+---------+
|    .    |
|   /.\   |
|  //.\\  |
| ///.\\\ |
| \\\./// |
|  \\.//  |
|   \./   |
|    .    |
+---------+
| \\\./// |
|  \\.//  |
|   \./   |
|    .    |
|    .    |
|   /.\   |
|  //.\\  |
| ///.\\\ |
+---------+
*/

public class Chapter02PP03 {
  public static int SIZE = 4;
  public static void main(String[] args) {

    drawDivider();
    drawTriangle();
    drawVee();
    drawDivider();
    drawTriangle();
    drawVee();
    drawDivider();
  }

  public static void drawTriangle() {
    for (int line = 1; line <= SIZE; line++) {
      System.out.print("|");

      int spaceCount = SIZE + 1 - line;
      int slashCount = line - 1;
      for (int i = 1; i <= spaceCount; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i <= slashCount; i++) {
        System.out.print("/");
      }

      System.out.print("*");

      for (int i = 1; i <= slashCount; i++) {
        System.out.print("\\");
      }
      // draw spaces
      for (int i = 1; i <= spaceCount; i++) {
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }

  public static void drawVee() {
    for (int line = 1; line <= SIZE; line++) {
      System.out.print("|");

      int spaceCount = line;
      int slashCount = SIZE - line;

      for (int i = 1; i <= spaceCount; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i <= slashCount; i++) {
        System.out.print("\\");
      }

      System.out.print("*");

      for (int i = 1; i <= slashCount; i++) {
        System.out.print("/");
      }
      // draw spaces
      for (int i = 1; i <= spaceCount; i++) {
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }

  public static void drawDivider() {
    System.out.print("+");

    int dashCount = 2 * SIZE + 1;

    for (int i = 1; i <= dashCount; i++) {
      System.out.print("-");
    }

    System.out.println("+");
  }
}
