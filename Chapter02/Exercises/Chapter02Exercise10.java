/*
It’s common to print a rotating, increasing list of single-digit numbers
at the start of a program’s output as a visual guide to number the columns
of the output to follow. With this in mind, write nested for loops
to produce the following output, with each line 60 characters wide:

         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890
*/
public class Chapter02Exercise10 {
  public static void main(String[] args) {

    pipes();
    numbers();

  }
  // method for columns
  public static void pipes() {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.print(" ");
      }
      System.out.print("|");
    }
    System.out.println();
  }

  // method for numbers
  public static void numbers() {
    String nums = "";
    for (int i = 1; i <= 6; i ++) {
      for (int j = 1; j <= 9; j++) {
          nums += j;
      }
      nums += "0";
    }
    System.out.println(nums);
  }
}
