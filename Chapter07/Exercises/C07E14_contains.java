/*
Write a method called contains that accepts two arrays of integers a1 and a2
as parameters and that returns a boolean value indicating whether or not the sequence of
elements in a2 appears in a1 (true for yes, false for no).
The sequence must appear consecutively and in the same order.

int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
int[] list2 = {1, 2, 1};

contains(list1, list2) should return true because the sequence of values
in list2 [1, 2, 1] is contained in list1 starting at index 5.
If list2 had stored the values [2, 1, 2], the call of contains(list1, list2) would return
false.
Any two lists with identical elements are considered to contain each other. Every array
contains the empty array, and the empty array does not contain any arrays other than the
empty array itself.
*/
import java.util.Arrays;

public class C07E14_contains {
  public static void main(String[] args) {

    int[] tester = {1, 6, 2, 1, 4, 1, 2, 1, 8};
    int[] listTrue = {1, 2, 1};
    int[] listFalse = {2, 1, 2};
    int[] emptyList = {};

    IO.println("--- Test 1 (True: {1, 2, 1} in tester) ---");
    IO.println(contains(tester, listTrue)); // Expected: true

    IO.println("\n--- Test 2 (False: {2, 1, 2} in tester) ---");
    IO.println(contains(tester, listFalse)); // Expected: false

    IO.println("\n--- Test 3 (Edge Case: Empty Sub-array) ---");
    IO.println(contains(tester, emptyList)); // Expected: true

    IO.println("\n--- Test 4 (Edge Case: Identical Arrays) ---");
    IO.println(contains(listTrue, listTrue)); // Expected: true

  }

  public static boolean contains(int[] mainArray, int[] subArray) {

    // if nothing in subArray, then true
    if (subArray.length == 0) {
      return true;
    }

    // outer loop: only need to check up to the point where a fully subArray seq can fit
    int maxStartIndex = mainArray.length - subArray.length;

    for (int i = 0; i < maxStartIndex; i++) {

      // assume a match is found until proven otherwise
      boolean sequenceMatches = true;

      // inner loop: check the entire subArray starting from the current position
      for (int j = 0; j < subArray.length; j++) {

        // compare the j of subArray to the i of mainArray
        if (mainArray[i + j] != subArray[j]) {
          // mismatch, so not the starting position
          sequenceMatches = false;
          break;
        }
      }
      // if the inner loop finished without finding a mismatch, sequence was found
      if (sequenceMatches) {
        return true;
      }
    }

    // if outer loop finishes without ever return true, sequence never found
    return false;
  }
}
