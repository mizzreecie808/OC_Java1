/*
Write a method called pigLatin that accepts as a parameter a Scanner representing an
input file. Your method should, preserving line breaks, print out the input file’s text
in a simplified version of Pig Latin, a silly English variant where the first letter
of each word is moved to the end.
You should also convert every word to lowercase.
*/

import java.io.*;
import java.util.*;

public class C06E20_pigLatin {

  public static final String DIRECTORY = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";

  public static void main(String[] args) throws FileNotFoundException {

    File filePigLatin = new File(DIRECTORY, "pig_latin.txt");

    // check the file exists
    if (!filePigLatin.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the Scanner for input
    Scanner scPigLatin = new Scanner(filePigLatin);

    // 2. Pass the input Scanner to the method
    pigLatin(scPigLatin);

    // 3. Close the scanner
    scPigLatin.close();
  }

  public static void pigLatin(Scanner pig) {

    // check for null input
    if (pig == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    // 1. READ & PROCESS each line
    while (pig.hasNextLine()) {
      String line = pig.nextLine();

      // convert the line to lowercase
      line = line.toLowerCase();

      // create a temporary scanner for each word
      Scanner wordScanner = new Scanner(line);

      // 2. READ & PROCESS word by word
      while (wordScanner.hasNext()) {
        String word = wordScanner.next();

        // convert the word useing the traditional rules
        String pigLatinWord = convert(word);

        // print the word to the console
        IO.print(pigLatinWord);

        // Add a space ONLY if there is another word
        if (wordScanner.hasNext()) {
          IO.print(" ");
        }
      }
      // print a new line
      IO.println();
    }
  }


  // determines where 1st vowel is
  public static String convert(String originalWord) {

    // check for empty string
    if (originalWord.length() == 0) {
      return "";
    }

    String vowels = "aeiou";
    String convertedWord = "";

    // check if word starts with vowel
    if (vowels.indexOf(originalWord.charAt(0)) != -1) {
      convertedWord = originalWord + "yay";

    } else {
      // words starting with consonants
      convertedWord = originalWord.substring(1) + originalWord.charAt(0) + "ay";
    }
    return convertedWord;
  }
}
