/*
Write a method called vowelCount that accepts a String as a parameter and produces and
returns an array of integers representing the counts of each vowel in the string.
The array returned by your method should hold five elements: the first is the count of As,
the second is the count of Es, the third Is, the fourth Os, and the fifth Us.
Assume that the string contains no uppercase letters.
*/
import java.util.Arrays;

public class C07E17_vowelCount {

  // The string of vowels is ordered to match the array indices: A=0, E=1, I=2, O=3, U=4
  private static final String VOWELS = "aeiou";

  public static void main(String[] args) {

    String tester = "i think, therefore i am";
    int[] counted = vowelCount(tester);
    System.out.println("Input: \"" + tester + "\"");
    System.out.println("Vowel Counts [a, e, i, o, u] : " + Arrays.toString(counted));
    // Expected Output: [1, 3, 3, 1, 0]

  }
  public static int[] vowelCount(String str) {

    // initialize a new array to hold the vowel count
    int[] counts = new int[5];

    // iterate through every character in the string once
    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);

      // get the index of the character within the VOWELS String
      int index = VOWELS.indexOf(letter);
      if (index != -1) {
        counts[index]++;
      }
    }
    return counts;
  }
}
