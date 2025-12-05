/*
Modify your SlashFigure program from the previous exercise to become a
new program called SlashFigure2 that uses a global constant for the
figure’s height. (You may want to make loop tables first.)
The previous output used a constant height of 6.
The following are the outputs for constant heights of 4 and 8:
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!!!!!////////
\\\\\\\\\\!!!!!!!!!!//////////
\\\\\\\\\\\\!!!!!!////////////
\\\\\\\\\\\\\\!!//////////////
*/
public class C02E17_SlashFigure2 {
  public static final int SIZE = 4;

  public static void main(String[] args) {

    for (int line = 1; line <= SIZE; line++) {
      int slash = 2 * line - 2;
      int exclamation = -4 * line + 4 * SIZE + 2;

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
