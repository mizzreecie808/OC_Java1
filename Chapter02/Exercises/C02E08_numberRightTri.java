/*
Write a for loop that produces:
    1
   22
  333
 4444
55555
*/
public class C02E08_numberRightTri {
  public static void main(String[] args) {
    for (int row = 1; row <= 5; row++) {

      // inner loop for spaces
      for (int space = 5; space > row; space--) {
        System.out.print(" ");
      }
      // inner loop for repeating numbers
      for (int nums = 1; nums <= row; nums ++) {
        System.out.print(row);  // use row, not nums
      }
      System.out.println();
    }
  }
}
