/*
Write a method called leetSpeak that accepts two parameters: a Scanner representing an
input file, and a PrintStream representing an output file. Convert the input file’s
text to “leet speak,” where various letters are replaced by other letters/numbers,
and output the new text to the given output file. Replace "o" with "0", "l"
(lowercase “L”) with "1" (the number one), "e" with "3", "a" with "4", "t" with "7",
and an "s" at the end of a word with "Z". Preserve the original line breaks from the
input. Also wrap each word of input in parentheses.
*/

import java.io.*;
import java.util.*;

public class C06E19_leetSpeak {

  public static final String DIRECTORY = "C:\\Users\\richa\\git\\OC_Java1\\Chapter06\\scannerFiles\\";

  public static void main(String[] args) throws FileNotFoundException {

    File fileEnglish = new File(DIRECTORY, "english.txt");
    File fileLeet = new File(DIRECTORY, "leet.txt");

    // check the file exists
    if (!fileEnglish.canRead() || !fileLeet.canRead()) {
      IO.println("No valid file found, exiting program.");
      return;
    }

    // 1. Create the Scanner for input
    Scanner scEnglish = new Scanner(fileEnglish);

    // 2. Create the PrintStream for output, using the File object
    PrintStream psLeet = new PrintStream(fileLeet);

    // 3. Pass the input Scanner and output PrintStream to the method
    leetSpeak(scEnglish, psLeet);

    // 4. Close the streams
    scEnglish.close();
    psLeet.close();

  }

  public static void leetSpeak(Scanner english, PrintStream leet) throws FileNotFoundException {

    // check for null input
    if (english == null) {
      throw new IllegalArgumentException("Input cannot be null.");
    }

    // 1. READ & PROCESS each line
    while (english.hasNextLine()) {
      String line = english.nextLine();

      Scanner wordScanner = new Scanner(line);

      // 2. READ & PROCESS word by word
      while (wordScanner.hasNext()) {
        String leetChars = "aeolst";
        String word = wordScanner.next();
        String newWord = "(";
        int length = word.length();

        for (int i = 0; i < length; i++) {
          char currChar = word.charAt(i);

          // run the conversion, will return original character if not a leetChar
          char leetChar = leetConversion(currChar, length, i);
          newWord += leetChar;
        }

        // add the ending parentheses
        newWord += ")";

        // check if there is another word then add a space
        if (wordScanner.hasNext()) {
          newWord += " ";
        }
        leet.print(newWord);
      }

      // close the temporary word scanner
      wordScanner.close();
      leet.println();
    }
  }

  public static char leetConversion(char originalChar, int length, int index) {

    if (originalChar == 'a') {
      return '4';
    } else if (originalChar == 'e') {
      return '3';
    } else if (originalChar == 'o') {
      return '0';
    } else if (originalChar == 'l') {
      return '1';
    } else if (originalChar == 's') {
      if (index == length - 1) {
        return 'Z';
      } else {
        return originalChar;
      }
    } else if (originalChar == 't') {
      return '7';
    } else {
      return originalChar;
    }
  }
}
