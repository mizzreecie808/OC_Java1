/*
Chapter 01 - Programming Project 1
Write a program to spell out MISSISSIPPI using block letters like the
following (one per line):
*/
public class Mississippi {
  public static void main(String[] args) {
    printM();
    printI();
    printS();
    printS();
    printI();
    printS();
    printS();
    printI();
    printP();
    printP();
    printI();

  }

  public static void printM() {
    System.out.println("M     M");
    System.out.println("MM   MM");
    System.out.println("M M M M");
    System.out.println("M  M  M");
    System.out.println("M     M");
    System.out.println("M     M");
    System.out.println("M     M");
  }

  public static void printI() {
    System.out.println(" IIIII");
    System.out.println("   I");
    System.out.println("   I");
    System.out.println("   I");
    System.out.println("   I");
    System.out.println("   I");
    System.out.println(" IIIII");
  }

  public static void printS() {
    System.out.println(" SSSSS ");
    System.out.println("S     S");
    System.out.println("S");
    System.out.println(" SSSSS ");
    System.out.println("      S");
    System.out.println("S     S");
    System.out.println(" SSSSS ");
  }

  public static void printP() {
    System.out.println("PPPPPP");
    System.out.println("P     P");
    System.out.println("P     P");
    System.out.println("PPPPPP");
    System.out.println("P");
    System.out.println("P");
    System.out.println("P");
  }
}
