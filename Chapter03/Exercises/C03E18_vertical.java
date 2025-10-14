/*
Write a method called vertical that accepts a string as its parameter and
prints each letter of the string on separate lines. For example, a call of
vertical("hey now")
*/

public class C03E18_vertical {
  public static void main(String[] args) {

    vertical("hey now");

  }

  public static void vertical(String word) {
    // remove all spaces
    word = word.replaceAll("\\s+", "");
    for (int i = 0; i < word.length(); i++) {
      IO.println(word.charAt(i));
    }
  }
}
