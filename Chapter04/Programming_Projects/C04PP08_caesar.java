/*
Write a program that produces a Caesar cipher of a given message string. A Caesar
cipher, or rotation cipher, is formed by rotating each letter of a message by a
given amount. For example, if you rotate by 3, every A becomes D; every B becomes E;
and so on. Toward the end of the alphabet, you wrap around: X becomes A; Y becomes B;
and Z becomes C. Your program should prompt for a message and an amount by which to
rotate each letter and should output the encoded message.
*/

import java.util.Scanner;

public class C04PP08_caesar {
  public static void main(String[] args) {

    caesar();

  }

  public static String caesar() {
    Scanner console = new Scanner(System.in);
    IO.print("Your message? ");
    String message = console.nextLine();

    if (message == null) {
      throw new IllegalArgumentException("Message cannot be null.");
    }

    IO.print("Encoding key? ");
    int key = console.nextInt();

    if (key < 1 || key > 25) {
      throw new IllegalArgumentException("Rotation key must be between 1 and 25");
    }

    // initialize the return value of cipher
    String cipher = "";

    // convert to upperCase since the output is upperCase
    message = message.toUpperCase();

    // loop through each char in string
    for (int i = 0; i < message.length(); i++) {

      // initialize and assign the character @ i we are looking at
      char currChar = message.charAt(i);

      // only process letters
      if (currChar >= 'A' && currChar <= 'Z') {
        int currCharValue = currChar + key;

        if (currCharValue > 'Z') {
          // subtract 26 to get back to start of alphabet
          currCharValue = currCharValue - 26;
        }
        cipher += (char) currCharValue;
      } else {
        cipher += currChar;
      }
    }
    // used for testing code
    IO.println(cipher);
    return cipher;
  }

  public static String caesar(String message, int key) {

    String cipher = "";
    // convert to upperCase since the output is upperCase
    message = message.toUpperCase();

    // loop through each char in string
    for (int i = 0; i < message.length(); i++) {
      char currChar = message.charAt(i);

      // only process letters
      if (currChar >= 'A' && currChar <= 'Z') {
        int currCharValue = currChar + key;

        if (currCharValue > 'Z') {
          // subtract 26 to get back to start of alphabet
          currCharValue = currCharValue - 26;
        }
        cipher += (char) currCharValue;
      } else {
        cipher += currChar;
      }
    }
    IO.println(cipher);
    return cipher;
  }
}
