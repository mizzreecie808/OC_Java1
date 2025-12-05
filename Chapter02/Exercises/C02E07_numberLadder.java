/*
Write a for loop that produces:
    1
   2
  3
 4
5
*/
public class C02E07_numberLadder {
  public static void main(String[] args) {
    // for (int row = 1; row <= 5; row++) {
    //
    //   // start opposite of row
    //   for (int space = 5; space > row; space--) {
    //     System.out.print(" ");
    //
    //   }
    //   System.out.print(row);
    //   System.out.println();
    // }

    int i = 6;
    System.out.println(i++);
    System.out.println(i);

    i = 10;
    System.out.println(++i);
    System.out.println(i);
  }
}
