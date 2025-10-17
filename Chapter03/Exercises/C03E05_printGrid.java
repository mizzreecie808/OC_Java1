/*
Write a method called printGrid that accepts two integers representing a
number of rows and columns and prints a grid of integers from
1 to (rows * columns) in column major order.
For example, the call
printGrid(4, 6);
1 5 9 13 17 21
2 6 10 14 18 22
3 7 11 15 19 23
4 8 12 16 20 24
*/
public class C03E05_printGrid {
  public static void main(String[] args) {
    printGrid(4, 6);
  }

  public static void printGrid(int rows, int columns) {

    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns; column++) {
        int num = (column * rows) + (row + 1);
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
