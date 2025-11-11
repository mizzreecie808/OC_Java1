/*
Write a method called isMagicSquare that accepts a two-dimensional array of integers as
a parameter and returns true if it is a magic square. A square matrix is a magic square
if all of its row, column, and diagonal sums are equal.
*/
import java.io.*;
import java.util.Arrays;

public class C07E21_isMagicSquare {

  public static void main(String[] args) {
    int[][] magic = {
      {2, 7, 6},
      {9, 5, 1},
      {4, 3, 8}
    };

    IO.println(matrixAdd(magic));

  }

  public static boolean matrixAdd(int[][] arr) {

    // calculate length once for use multiple times
    int size = arr.length;

    // 1. Calculate the target sum (First Row of Array)
    int targetSum = 0;

    for (int colIndex = 0; colIndex < size; colIndex++) {
      targetSum += arr[0][colIndex];
    }

    // 2. Check all row sums
    for (int rowIndex = 0; rowIndex < size; rowIndex++) {
      int currentRowSum = 0;
      for (int colIndex = 0; colIndex < size; colIndex++) {
        currentRowSum += arr[rowIndex][colIndex];
      }
      if (currentRowSum != targetSum) {
        return false;
      }
    }

    // 3. Check all column sums. rows are changing while column is fixed
    for (int colIndex = 0; colIndex < size; colIndex++) {
      int currentColSum = 0;
      for (int rowIndex = 0; rowIndex < size; rowIndex++) {
        currentColSum += arr[rowIndex][colIndex];
      }
      if (currentColSum != targetSum) {
        return false;
      }
    }

    // 4. Check diaganol sums
    int mainDiagSum = 0;
    for (int k = 0; k < size; k++) {
      mainDiagSum += arr[k][k];
    }

    if (mainDiagSum != targetSum) {
      return false;
    }

    // 5. Check anti-diaganol sum
    int antiDiagSum = 0;
    // loop through the rows (rowIndex)
    for (int rowIndex = 0; rowIndex < size; rowIndex++) {
      // calculate the corresponding column index
      int colIndex = size - 1 - rowIndex;
      antiDiagSum += arr[rowIndex][colIndex];
    }

    if (antiDiagSum != targetSum) {
      return false;
    }

    // if all checks pass then number is magic
    return true;

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
