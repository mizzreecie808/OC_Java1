/*
Write a method called repl that accepts a String and a number of repetitions
as parameters and returns the String concatenated that many times.
repl("hello", 3) should return "hellohellohello".
If the number of repetitions is zero or less, the method should return
an empty string.
*/
public class C04E02_repl {
  public static void main(String[] args) {
    repl("hello", 3);

  }

  // 4.2 repl
  public static String repl(String word, int reps) {
    String result = "";
    for (int i = 0; i < reps; i++) {
      result += word;
    }
    IO.println(result);
    return result;
  }
}
