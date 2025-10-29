/*
Write a method called isAllVowels that returns whether a string consists entirely of
vowels (a, e, i, o, or u, case-insensitively). If and only if every character of the
string is a vowel, your method should return true.
isAllVowels("eIEiO") returns true
isAllVowels("oink") returns false.
You should return true if passed the empty string
*/

public class C05E24_isAllVowels {
  public static void main(String[] args) {

    IO.println(isAllVowels("eIEiO"));
    IO.println(isAllVowels(""));
    IO.println(isAllVowels(null));

  }

  // - 5.24 isAllVowels (error on null)
  public static boolean isAllVowels(String word) {

    if (word == null) {
      throw new NullPointerException("Input cannot be null.")
    }

    // check both lower & upper case
    String vowels = "aeiouAEIOU";

    // starting at 0 allows for an empty string
    for (int i = 0; i < word.length(); i++) {
      // if equals -1 then letter is a consonant, return false, end the method
      if (vowels.indexOf(word.charAt(i)) == -1) {
        return false;
      }
    }
    return true;
  }
}
