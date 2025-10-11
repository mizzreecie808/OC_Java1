/*
Write a method called printPowersOf2 that accepts a maximum number as an
argument and prints each power of 2 from 2^0(1) up to that maximum power,
inclusive. For example, consider the following calls:

printPowersOf2(3);
printPowersOf2(10);
1 2 4 8
1 2 4 8 16 32 64 128 256 512 1024
*/
public class C03E02_printPowersOf2 {
  public static void main(String[] args) {
    printPowersOf2(3);
    printPowersOf2(10);

  }

  public static void printPowersOf2(int number) {
    for (int i = 0; i <= number; i++) {
      double squared = Math.pow(2, i);
      System.out.print((int) squared + " ");
    }
    System.out.println();
  }
}
