/*
Write a method called matrixAdd that accepts a pair of two-dimensional arrays of
integers as parameters, treats the arrays as two-dimensional matrixes, and returns
their sum. The sum of two matrixes A and B is a matrix C, where for every row i and
column j, Cij = Aij + Bij
You may assume that the arrays passed as parameters have the same dimensions.
*/
import java.io.*;
import java.util.Arrays;

public class C07E20_matrixAdd {

  public static void main(String[] args) {
    int[][] matrixA = {
      {1, 2, 3},
      {4, 5, 6}
    };

    int[][] matrixB = {
      {10, 20, 30},
      {40, 50, 60}
    };

    int[][] result = matrixAdd(matrixA, matrixB);
    print2DArray(result);

  }

  public static int[][] matrixAdd(int[][] a, int[][] b) {

    int[][] total = new int[a.length][a[0].length];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        total[i][j] = a[i][j] + b[i][j];
      }
    }
    return total;
  }

  public static void print2DArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i < arr.length && j < arr[i].length) {
          // In a rectangular 2D array, you don't have to worry about values being
          // null, but other types of MultiD arrays can be otherwise
          IO.print("[" + arr[i][j] + "]");
          // you'll want to remember formatting, and you're printing as a table,
          // watch the print vs println
        }
      }
      IO.println();
    }
  }
}
