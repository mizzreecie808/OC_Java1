/*
Write a method called printAcronym that accepts a string as its parameter and prints
the first letter of each word of the string as an acronym.
printAcronym("Breath of the Wild") should print "BotW".
You may assume that the string contains at least one word and does not have any
surrounding whitespace at its start or end.
*/
public class C04E22_printAcronym {
  public static void main(String[] args) {

    printAcronym("Breath of the Wild");

  }

  public static void printAcronym(String word) {
    String acronym = "" + word.charAt(0);
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == ' ') {
        acronym += word.charAt(i + 1);
      }
    }
    IO.println(acronym);
  }
}
