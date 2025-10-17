/*
Write a method called processName that accepts a Scanner for the console
as a parameter and prompts the user to enter a full name, then prints
the name in reverse order (i.e., last name, first name).
Here is an example dialogue with the user:
Please enter your full name: Sammy Jankis
Your name in reverse order is Jankis, Sammy
*/
import java.util.Scanner;

public class C03E21_processName {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    processName(console);

  }

  public static void processName(Scanner console) {
    IO.print("Please enter your full name: ");
    String name = console.nextLine();
    int space = name.indexOf(" ");
    String firstWord = name.substring(space + 1, name.length());
    String secondWord = name.substring(0, space);
    IO.println("Your name in reversed order is " + firstWord + ", " + secondWord);
  }
}
