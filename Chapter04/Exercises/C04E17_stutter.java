/*
Write a method called stutter that accepts a string parameter and returns that string
with its characters repeated twice.
stutter("Hello!") returns "HHeelllloo!!"
*/
public class C04E17_stutter {
  public static void main(String[] args) {

    stutter("Hello!");

  }

  public static String stutter(String word) {
    String stutter = "";

    for (int i = 0; i < word.length(); i++) {
      char currChar = word.charAt(i);
      stutter = stutter + currChar + currChar;
    }
    IO.println(stutter);
    return stutter;
  }
}
