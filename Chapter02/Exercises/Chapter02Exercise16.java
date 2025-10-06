/*
Write a Java program called SlashFigure that produces the following output.
Use nested for loops to capture the structure of the figure.
!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////
*/
public class Chapter02Exercise16 {

  public static void main(String[] args) {

    int size = 6;
    for (int line = 1; line <= size; line++) {
      int slash = 2 * line - 2;
      int exclamation = -4 * line + 26;

      // 1. inner loop backslahes (\\)
      for (int i = 1; i <= slash; i++) {
        System.out.print("\\");
      }

      // 2. inner loop exclamation (!)
      for (int i = 1; i <= exclamation; i++) {
        System.out.print("!");
      }

      // 3. inner loop forward slash (/)
      for (int i = 1; i <= slash; i++) {
        System.out.print("/");
      }
      System.out.println();
    }

  }
}
