/*
Write a program that outputs “The Name Game,” where the user inputs a first
and last name and a song is printed about their first, then last, name.
Use a method to avoid redundancy.
*/
import java.util.Scanner;

public class C03E22_nameGame {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    nameGame(console);

  }

  public static String nameGame(Scanner console) {
    IO.print("What is your first name? ");
    String first = console.next();
    IO.print("What is your last name? ");
    String last = console.next();
  }

  public static void printSong() {
    
  }
}
