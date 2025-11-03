public class practice {
  public static void main(String[] args) {
    int heads = 3;
    int tails = 2;
    double percent = heads / ((double) heads + tails) * 100;
    IO.println(percent);

    String word = "string";
    IO.println(word.length());
    IO.println(word.indexOf('g'));
    IO.println(word.length() == word.indexOf('g'));
  }
}
