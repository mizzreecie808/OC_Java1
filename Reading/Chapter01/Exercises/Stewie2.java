/*
Chapter 01 - Exercise 8
Write a complete Java program called Stewie2 that prints the following output.
Use at least one static method besides main.
////////////////////// f
|| Victory is mine! || w
\\\\\\\\\\\\\\\\\\\\\\ b
|| Victory is mine! || w
\\\\\\\\\\\\\\\\\\\\\\ b
|| Victory is mine! || w
\\\\\\\\\\\\\\\\\\\\\\ b
|| Victory is mine! || w
\\\\\\\\\\\\\\\\\\\\\\ b
|| Victory is mine! || w
\\\\\\\\\\\\\\\\\\\\\\ f
*/

public class Stewie2 {
  public static void main(String[] args) {
    forward();
    words();
    back();
    words();
    back();
    words();
    back();
    words();
    back();
    forward();

  }
  public static void forward() {
    System.out.println("//////////////////////");
  }
  public static void back() {
    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
  }

  public static void words() {
    System.out.println("|| Victory is mine! ||");
  }
}
