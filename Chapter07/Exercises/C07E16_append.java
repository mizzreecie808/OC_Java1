/*
Write a method called append that accepts two integer arrays as parameters and returns
a new array that contains the result of appending the second array’s values at the end
of the first array.
*/
import java.util.Arrays;

public class C07E16_append {
  public static void main(String[] args) {

    int[] list1 = {2, 4, 6};
    int[] list2 = {1, 2, 3, 4, 5};
    int[] group = append(list1, list2);
    IO.println(Arrays.toString(group));


  }

  public static int[] append(int[] a1, int[] a2) {

    int totalLength = a1.length + a2.length;
    int offset = a1.length;

    // create new array using copyOf starting with the a1 and totalLength
    int[] combo = Arrays.copyOf(a1, totalLength);

    for (int i = 0; i < a2.length; i++) {
      combo[offset + i] = a2[i];
    }
    return combo;
  }
}
