/*
Write a static method called xo that accepts an integer size as a parameter
and prints a square of size by size characters, where all characters are “o”
except that an “x” pattern of “x” characters has been drawn from the corners
of the square. On the first line, the first and last characters are “x”;
on the second line, the second and second-from-last characters are “x”;
 and so on. Here are two example outputs:
xo(5) xo(6)
xooox	xoooox
oxoxo	oxooxo
ooxoo	ooxxoo
oxoxo	ooxxoo
xooox oxooxo
      xoooox
*/
public class C04E07_xo {
  public static void main(String[] args) {

    xo(5);
    xo(6);

  }

  public static void xo(int size) {

    for (int row = 0; row <= size -1; row++) {
      for (int col = 0; col <= size - 1; col++) {
        // row == col prints the diaganol from top left to bottom right
        // row + col == size - 1 prints from top right to bottom left
        if ((row == col) || ((row + col) == size - 1)) {
          IO.print("x");
        } else {
          IO.print("o");
        }
      }
      IO.println();
    }
  }
}
