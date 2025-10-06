/*
Modify your StarFigure program from the previous exercise to become a
new program named StarFigure2 that uses a global constant for the
figure’s height. (You may want to make loop tables first.)
The previous output used a constant height of 5.
The following are the outputs for constant heights of 3 and 6:
///////////\\\\\\\\\\\\
///////********\\\\\\\\
***********************

///////////////\\\\\\\\\\\\\\\\\
///////////********\\\\\\\\\\\\\
////////****************\\\\\\\\\\
////************************\\\\\\
///*******************************\\\
*************************************
See StarFigure.txt
*/
public class Chapter02Exercise21 {

  public static int SIZE = 5;

  public static void main(String[] args) {

    for (int line = 1; line <= SIZE; line++) {
      int slash = 4 * SIZE -4 * line;
      int star = 8 * line -4 * SIZE + 12;

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
