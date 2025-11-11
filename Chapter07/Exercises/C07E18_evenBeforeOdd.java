/*
Write a method called evenBeforeOdd that accepts an array of integers and rearranges its
elements so that all even values appear before all odds.
The exact order of the elements does not matter, so long as all even values appear
before all odd values. The array might contain no even elements or no odd elements.
Do not use any temporary arrays in your solution, and do not call Arrays.sort.
*/
import java.util.Arrays;

public class C07E18_evenBeforeOdd {
  public static void main(String[] args) {

    int[] tester = {5, 4, 2, 11, 9, 10, 4, 7, 3};

    // IMPORTANT: The method modifies the array in place, so you pass the array,
    // and you print the array afterward. You don't need to assign the result
    // back to a variable (since the method is void).
    evenBeforeOdd(tester);

    System.out.println(Arrays.toString(tester));
    // Expected [4, 4, 2, 10, 9, 11, 5, 7, 3] (or any valid permutation)
  }

  public static void evenBeforeOdd(int[] arr) {

    // 'left' pointer starts at the beginning (index 0);
    int left = 0;

    // 'right' pointer starts at the end
    int right = arr.length - 1;

    while (left < right) {

      // 1. move left pointer past any elements that are already correct (evens)
      if (arr[left] % 2 == 0) {
        left++;
      }

      // 2. move right pointer past any elements that are already correct (odds)
      else if (arr[right] % 2 != 0) {
        right--;
      }

      // 3. we stopped so perform the swap
      else {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // move both pointers inward to continue searching
        left++;
        right--;
      }
    }
  }
}
