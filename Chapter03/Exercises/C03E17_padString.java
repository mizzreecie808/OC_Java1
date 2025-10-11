/*
Write a method called padString that accepts two parameters:
a string and an integer representing a length.
The method should pad the parameter string with spaces until its length
is the given length. (This sort of method is useful when trying to print output
that lines up horizontally.) If the string’s length is already at least
as long as the length parameter, your method should return the original string.
padString("hello", 8) should return "hello "
padString("congratulations", 10) should return "congratulations"
*/

public class C03E17_padString {
  public static void main(String[] args) {

    padString("hello", 8);
    padString("congratulations", 10);

  }

  public static String padString(String word, int length) {
    int padding = length - word.length();
    for (int i = 0; i < padding; i++) {
      word += " ";
    }
    return word;
  }
}
