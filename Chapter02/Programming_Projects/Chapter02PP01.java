/*
Write a program that produces the following output using nested for loops:
****** //////////// ******
*****  //////////\\  *****
****   ////////\\\\   ****
***    //////\\\\\\    ***
**     ////\\\\\\\\     **
*      //\\\\\\\\\\      *
       \\\\\\\\\\\\
See OneNote for loop limit table
*/

public class Chapter02PP01 {

  public static int SIZE = 4;

  public static void main(String[] args) {
    drawFigure();

  }

  public static void drawFigure() {
    for (int line = 1; line <= SIZE; line++) {

        // draw stars loop limit = SIZE + 1 - line
        for (int star = 1; star <= SIZE + 1 - line; star++) {
          System.out.print("*");
        }

        // draw spaces loop limit = line
        for (int space = 1; space <= line; space++) {
          System.out.print(" ");
        }

        // draw (/) loop limit = 2 * SIZE + 2 - 2 * line
        for (int fSlash = 1; fSlash <= 2 * SIZE + 2 - 2 * line; fSlash++) {
          System.out.print("/");
        }

        // draw (\\) loop limit = 2 * line - 2
        for (int bSlash = 1; bSlash <= 2 * line - 2 ; bSlash++) {
          System.out.print("\\");
        }

        // draw spaces loop limit = line
        for (int space = 1; space <= line; space++) {
          System.out.print(" ");
        }

        // draw stars loop limit = SIZE + 1 - line
        for (int star = 1; star <= SIZE + 1 - line; star++) {
          System.out.print("*");
        }
        System.out.println();
    }
    bottomLine();

  }

  public static void bottomLine() {
    // draw spaces loop limit = SIZE + 1)
    for (int i = 1; i <= SIZE + 1; i++) {
        System.out.print(" ");
    }

    // draw (\\) loop limit = 2 * SIZE
    for (int i = 1; i <= 2 * SIZE; i++) {
        System.out.print("\\");
    }
    System.out.println();
  }
}
