/*
Write a method called collapse that accepts an array of integers as a parameter and
returns a new array containing the result of replacing each pair of integers with the
sum of that pair.
*/
import java.util.Arrays;

public class C07E15_collapse {
  public static void main(String[] args) {

    // Test Case 1: Even length (10 elements)
    int[] tester1 = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
    int[] answer1 = {9, 17, 17, 8, 19};
    int[] result1 = collapse(tester1);
    System.out.println("Test 1 (Even) Input:  " + Arrays.toString(tester1));
    System.out.println("Test 1 (Even) Output: " + Arrays.toString(result1) + " (Expected: " + Arrays.toString(answer1) + ")");

    // Test Case 2: Odd length (11 elements) - Must carry over the last element (5)
    int[] tester2 = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10, 5};
    int[] answer2 = {9, 17, 17, 8, 19, 5}; // 19 comes from 9+10, 5 is the carry-over
    int[] result2 = collapse(tester2);
    System.out.println("\nTest 2 (Odd) Input:   " + Arrays.toString(tester2));
    System.out.println("Test 2 (Odd) Output:  " + Arrays.toString(result2) + " (Expected: " + Arrays.toString(answer2) + ")");

  }

  public static int[] collapse(int[] arr) {

    int originalLength = arr.length;
    int collapsedLength = 0;

    if (originalLength % 2 == 0) {
      collapsedLength = originalLength / 2 ;
    } else {
      collapsedLength = originalLength / 2 + 1;
    }

    int[] collapsedArray = new int[collapsedLength];

    for (int i = 0, j = 0; i < originalLength - 1 && j < collapsedLength; i+=2, j++) {
      int sum = arr[i] + arr[i + 1];
      collapsedArray[j] = sum;
    }

    if (originalLength % 2 == 1) {
      collapsedArray[collapsedLength - 1] = arr[originalLength - 1];
    }

    return collapsedArray;
  }
}
