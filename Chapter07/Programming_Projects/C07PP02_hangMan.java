/*
Write a game of Hangman using arrays. Allow the user to guess letters and represent
which letters have been guessed in an array.
*/

import java.util.Arrays;
import java.util.Scanner;

public class C07PP02_hangMan {

  public static void main(String[] args) {
    playGame();


  }

  public static void playGame() {

    boolean hasWon = false;

    Scanner userInput = new Scanner(System.in);

    while (!hasWon) {
      IO.print("Type a lowercase letter: ");
      while (!userInput.hasNext()) {
        String input = userInput.next();
        char letter = input.charAt(0);

        IO.println(letter);

        if (letter == 'a') {
          IO.println("you typed a");
          break;
        } else {
          
        }
      }
    }
  }
}

// create word to guess

// create while loop to track user guesses, could use a counter

// create array to track letters user has guessed

// the array will be shown to the user when a letter is correct with underscores
// for letters not guessed yet
// while (true) {
//   IO.print(prompt);
//
//   while (!sc.hasNextInt()) {
//     sc.next();
//     IO.print(wholeNumber);
//   }
//
//   // read the next valid input
//   input = sc.nextInt();
