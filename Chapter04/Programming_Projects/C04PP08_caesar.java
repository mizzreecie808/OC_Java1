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

    Scanner console = new Scanner(System.in);
    caesar("Attack zerg at dawn", 3);

  }

  public static String caesar(Scanner console) {
    IO.print("Your message? ");
    String message = console.nextLine();

    IO.print("Encoding key? ");
    int key = console.nextInt();

    String cipher = "";

    for (int i = 0; i < message.length(); i++) {
      int currValue = (int) message.charAt(i);
      int newValue = currValue + key;
      IO.println(currValue + " " + newValue);
    }

    return cipher;
  }

  public static String caesar(String message, int key) {

    String cipher = "";
    message = message.toUpperCase();

    key = key % 26;

    for (int i = 0; i < message.length(); i++) {
      char currChar = message.charAt(i);

      // only process letters
      if (currChar >= 'A' && currChar <= 'Z') {
        int newCharValue = currChar + key;

        if (newCharValue > 'Z') {
          newCharValue = newCharValue - 26;
        }
        cipher += (char) newCharValue;
      } else {
        cipher += currChar;
      }

      // int currValue = (int) message.charAt(i);
      // int newValue = 0;
      // if (currValue >= 88) {
      //   newValue =  + 65;
      // } else {
      //   newValue = currValue + key;
      // }
      // IO.println((char) currValue + " " + (char) newValue);
    }
    IO.println(cipher);
    return cipher;
  }
}
