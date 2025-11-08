/*
Write an interactive program that reads lines of input from the user and converts
each line into “Pig Latin.” Pig Latin is English with the initial consonant sound
moved to the end of each word, followed by “ay.” Words that begin with vowels simply
have an “ay” appended. For example, the phrase:
  The deepest shade of mushroom blue
would have the following appearance in Pig Latin:
  e-Thay eepest-day ade-shay of-ay ushroom-may ue-blay
Terminate the program when the user types a blank line.
*/

import java.util.Scanner;

public class C05PP01_pigLatin {
  public static void main(String[] args) {

    // Scanner console = new Scanner(System.in);
    // String result = pigLatin("The deepest shade of mushroom blue");
    // String answer = "e-Thay eepest-day ade-shay of-ay ushroom-may ue-blay";
    // IO.println(result);
    // IO.println(result.equals(answer));
    pigLatin();
    // IO.println(pig("of"));
  }

  public static void pigLatin() {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String userInput = sc.nextLine();

      // check if user types a blank line, terminate the program
      if (userInput.isEmpty()) {
        break;
      }
      String result = translate(userInput);
      IO.println(result);
    }
  }

  public static String translate(String sentence) {

    Scanner sc = new Scanner(sentence);
    String output = "";

    while (sc.hasNext()) {
      // get each word
      String word = sc.next();
      String pigWord = pig(word);

      output = output + pig(word) + " ";
    }
    return output.trim();
  }

  // determines where 1st vowel is
  public static String pig(String word) {

    String vowels = "aeiouAEIOU";
    int index = 0;
    String output = "";

    // check for word that starts with a vowel
    if (vowels.indexOf(word.charAt(index)) != -1) {
      output = word + "-ay";

    } else {
      // words starting with consonants
      for (int i = 0; i < word.length(); i++) {
        // find the index of the first vowel
        if (vowels.indexOf(word.charAt(i)) != -1) {
          String consonants = word.substring(0, i);
          String vowelsPlus = word.substring(i);

          // combine
          output = vowelsPlus + "-" + consonants + "ay";

          // stop at the first vowel found
          break;
        }
      }
    }
    return output;
  }
}
