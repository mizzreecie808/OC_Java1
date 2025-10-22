/*
Write a method called printPalindrome that accepts a Scanner for the console as a parameter,
prompts the user to enter one or more words, and prints whether the entered String is
a palindrome (i.e., reads the same forward as it does backward, like "abba" or "racecar").

For an added challenge, make the code case-insensitive, so that words like
“Abba” and “Madam” will be considered palindromes.
*/
public class C04E16_printPalindrome {
  public static void main(String[] args) {

    printPalindrome("racecar");
    printPalindrome("Abba");

  }

  public static void printPalindrome(String word) {
    String temp = word.toLowerCase();
    String reverse = "";

    for (int i = temp.length() - 1; i >= 0; i--) {
      reverse += temp.charAt(i);
    }

    if (temp.equals(reverse)) {
      IO.println(word + " is a Palindrome");
    } else {
      IO.println(word + " is not a Palindrome");
    }
  }
}
