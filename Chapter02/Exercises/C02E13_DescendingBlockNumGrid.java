/*
Modify the code from Exercise 12 to produce:
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
*/
public class C02E13_DescendingBlockNumGrid {

  public static final int LINES = 5;
  public static final int REPEAT = 5;
  public static final int NUMBERS = 9;

  public static void main(String[] args) {

    repeat();

  }

  // method for numbers
  public static void numbers() {
    for (int i = NUMBERS; i >= 0; i --) {
      for (int j = 1; j <= REPEAT; j++) {
          System.out.print(i);
      }
    }
  }

  public static void repeat() {
    for (int i = 1; i <= LINES; i++) {
      numbers();
      System.out.println();
    }
  }
}
