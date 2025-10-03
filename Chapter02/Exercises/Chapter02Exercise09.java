/*
Write a for loop that produces:
----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------
*/
public class Chapter02Exercise09 {
  public static void main(String[] args) {

    line();
    System.out.println();
    jagged();
    numbers();
    line();

  }
  // method for line
  public static void line() {
    for (int line = 1; line <= 40; line ++) {
      System.out.print("-");
    }
  }

  // loop for numbers
  public static void numbers() {
    String nums = "";
    for (int repeat = 1; repeat <= 2; repeat ++) {
      for (int num = 1; num <= 9; num++) {
          nums += num + "" + num;
      }
      nums += "00";
    }
    System.out.println(nums);
  }

  // loop for jagged line
  public static void jagged() {
    for (int triangle = 1; triangle <= 8; triangle ++) {
      System.out.print("_-^-_");
    }
    System.out.println();
  }
}
