/*
Modify the code from Exercise 13 to produce:
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
*/
public class Chapter02Exercise14 {

  public static final int LINES = 4;
  public static final int NUMBERS = 9;
  public static final int REPEAT = NUMBERS;

  public static void main(String[] args) {

    repeat();

  }

  // method for numbers
  public static void numbers() {
    for (int i = NUMBERS; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
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
