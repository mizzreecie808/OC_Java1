/*
Write a method called printPowersOfN that accepts a base and an exponent
as arguments and prints each power of the base from base^0(1) up to that
maximum power, inclusive. For example, consider the following calls:

printPowersOfN(4, 3);
printPowersOfN(5, 6);
printPowersOfN(–2, 8);
1 4 16 64
1 5 25 125 625 3125 15625
1 –2 4 –8 16 –32 64 –128 256
*/
public class C03E03_printPowersOfN { 
  public static void main(String[] args) {
    printPowersOfN(4, 3);
    printPowersOfN(5, 6);
    printPowersOfN(-2, 8);
  }

  public static void printPowersOfN(int base, int exponent) {
    double result = 1;
    System.out.print((int) result + " ");
    for (int i = 0; i < exponent; i++) {
      result *= base;
      System.out.print((int) result + " ");
    }
    System.out.println();
  }
}
