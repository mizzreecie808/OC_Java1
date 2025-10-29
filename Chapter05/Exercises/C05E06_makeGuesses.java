/*
Write a method called makeGuesses that guesses numbers between 1 and 50 inclusive until
it makes a guess of at least 48. It should report each guess and at the end should report
the total number of guesses made. Here is a sample execution:
guess = 43
guess = 47
guess = 45
guess = 27
guess = 49
total guesses = 5
*/

import java.util.*;

public class C05E06_makeGuesses {
  public static void main(String[] args) {

    makeGuesses();

  }

  public static void makeGuesses() {

    // Random object initialization
    Random r = new Random();

    // number to hit
    int magicNum = 48;
    int num;

    // use do/while loop so that loop is executed at least once
    int i = 0;
    do {
      num = r.nextInt(50) + 1;
      IO.println("guess = " + num);
      i++;
    } while (num < magicNum);

    IO.println("guesses = " + i);
  }
}
