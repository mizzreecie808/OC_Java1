/*
Write a for loop that produces:
1
22
333
4444
55555
666666
7777777
*/
public class C02E06_numberLeftTri {
  public static void main(String[] args) {
    for (int row = 1; row <= 7; row++) {
      for (int num = 1; num <= row; num++) {
        System.out.print(row);
      }
      System.out.println();
    }
  }
}
