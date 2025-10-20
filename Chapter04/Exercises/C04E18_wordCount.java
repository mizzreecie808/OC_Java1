/*
Write a method called wordCount that accepts a String as its parameter and
returns the number of words in the String. A word is a sequence of one or
more nonspace characters (any character other than ' ').
wordCount("hello") should return 1
wordCount("how are you?") should return 3
wordCount(" this string has wide spaces ") should return 5
wordCount(" ") should return 0
*/

public class C04E18_wordCount {
  public static void main(String[] args) {

    wordCount("hello");
    wordCount("how are you?");
    wordCount(" this string has wide spaces ");
    wordCount(" ");
    wordCount(null);

  }

  // 4.18 wordCount Error on invalid parameter
  public static int wordCount(String word) {

    // required Error on invalid parameter
    if (word == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }
    // .trim() = remove leading/trailing extra whitespace
    word = word.trim();

    if (word.length() == 0) {
      IO.println("Word length = 0");
      return 0;
    }

    // after return above, it's assumed that the input has at least 1 word
    int count = 1;

    // use a flag to check if char after space is another space
    boolean prevSpace = false;

    for (int i = 0; i < word.length(); i++) {
      char currChar = word.charAt(i);
      // check if current character is a space
      if (currChar == ' ') {
        // now we have 1 space, now check if next character is space
        prevSpace = true;
      } else {
        if (prevSpace) {
          count++;
        }
        // reset the flag
        prevSpace = false;
      }
    }
    IO.println("Word length = " + count);
    return count;
  }
}
