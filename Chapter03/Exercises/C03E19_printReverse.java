/*
Write a method called printReverse that accepts a string as its parameter
and prints the characters in opposite order. For example, a call of
printReverse("hello there!") should print "!ereht olleh".
If the empty string is passed, the method should produce no output.
*/

public class C03E19_printReverse {
  public static void main(String[] args) {

    printReverse("hello there!");

  }

  public static void printReverse(String word) {

    for (int i = word.length() - 1; i >= 0; i--) {
      IO.print(word.charAt(i));
    }
  }
}
