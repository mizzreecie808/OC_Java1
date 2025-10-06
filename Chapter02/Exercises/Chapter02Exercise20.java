/*
Write a Java program called StarFigure that produces the following output.
Use nested for loops to capture the structure of the figure.
////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************
See StarFigure.txt
*/
public class Chapter02Exercise20 {
  public static void main(String[] args) {

    int size = 5;

    for (int line = 1; line <= size; line++) {
      int slash = -4 * line + 20;
      int star = 8 * line - 8;

      // 1. inner loop forward slash (/)
      for (int i = 1; i <= slash; i++) {
        System.out.print("/");
      }

      // 2. inner loop star (*)
      for (int i = 1; i <= star; i++) {
        System.out.print("*");
      }

      // 3. inner loop backslahes (\\)
      for (int i = 1; i <= slash; i++) {
        System.out.print("\\");
      }
      System.out.println();
    }
  }
}
