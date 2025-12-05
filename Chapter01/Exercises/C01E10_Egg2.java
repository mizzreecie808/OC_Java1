/*
Chapter 01 - Exercise 10
Modify the program from the previous exercise to become a new program Egg2
that displays the following output. Use static methods as appropriate.
*/
public class C01E10_Egg2 {
  public static void main(String[] args) {
    fullEgg();
    middle();
    fullEgg();
    middle();
    bottom();
    top();
    middle();
    bottom();

  }

  public static void top() {
    System.out.println("  _______");
    System.out.println(" /       \\");
    System.out.println("/         \\");
  }

  public static void middle() {
    System.out.println("-\"-'-\"-'-\"-");
  }

  public static void bottom() {
    System.out.println("\\         /");
    System.out.println(" \\_______/");
  }

  public static void fullEgg() {
    top();
    bottom();
  }
}
