/*
Write a program that produces the following rocket ship figure as its
output using nested for loops. Use a class constant to make it possible
to change the size of the rocket
(the following output uses a size of 3).

     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
*/

public class Chapter02PP06 {

  public static int SIZE = 4;
  public static void main(String[] args) {

    printconeLimitFlames();
    printSeparator();
    printTriangle();
    drawVee();
    printSeparator();
    printTriangle();
    drawVee();
    printSeparator();
    printconeLimitFlames();
  }

  public static void printSeparator() {
    System.out.print("+");
    // loop limit based on SIZE * 2 (3 * 2 = 6 pairs of *=)
    int limit = SIZE * 2;
    for (int i = 1; i <= limit; i++) {
      System.out.print("*=");
    }
    System.out.println("+");
  }

  public static void printconeLimitFlames() {
    int limit = SIZE * 2 - 1;
    for (int line = 1; line <= limit; line++) {

      int spaceLimit = 2 * SIZE - line;
      for (int i = 1; i <= spaceLimit; i++) {
        System.out.print(" ");
      }

      int slashLimit = line;
      for (int i = 1; i <= slashLimit; i++) {
        System.out.print("/");
      }

      System.out.print("**");

      for (int i = 1; i <= line; i++) {
        System.out.print("\\");
      }
      System.out.println();
    }
  }

  public static void printTriangle() {
    for (int line = 1; line <= SIZE; line++) {
      System.out.print("|");

      int outerDotLimit = SIZE - line;
      for (int i = 1; i <= outerDotLimit; i++) {
        System.out.print(".");
      }

      int coneLimit = line;
      for (int i = 1; i <= coneLimit; i++) {
        System.out.print("/\\");
      }

      int centerDotLimit = 2 * SIZE - 2 * line;
      for (int i = 1; i <= centerDotLimit; i++) {
        System.out.print(".");
      }

      for (int i = 1; i <= coneLimit; i++) {
        System.out.print("/\\");
      }

      for (int i = 1; i <= outerDotLimit; i++) {
        System.out.print(".");
      }

      System.out.println("|");
    }
  }

  public static void drawVee() {
    for (int line = 1; line <= SIZE; line++) {
      System.out.print("|");

      int outerDotLimit = line - 1;
      for (int i = 1; i <= outerDotLimit; i++) {
        System.out.print(".");
      }

      int coneLimit = SIZE + 1 - line;
      for (int i = 1; i <= coneLimit; i++) {
        System.out.print("\\/");
      }

      int centerDotLimit = 2 * line - 2;
      for (int i = 1; i <= centerDotLimit; i++) {
        System.out.print(".");
      }

      for (int i = 1; i <= coneLimit; i++) {
        System.out.print("\\/");
      }

      for (int i = 1; i <= outerDotLimit; i++) {
        System.out.print(".");
      }

      System.out.println("|");
    }
  }


}
