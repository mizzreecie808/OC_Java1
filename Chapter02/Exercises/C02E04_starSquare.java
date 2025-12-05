/*
Write a for loop that produces:
*****
*****
*****
*****
*/
public class C02E04_starSquare {
  public static void main(String[] args) {
    for (int row = 1; row <= 4; row++) {
      for (int star = 1; star <= 5; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
