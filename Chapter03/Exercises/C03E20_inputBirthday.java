/*
Write a method called inputBirthday that accepts a Scanner for the console
as a parameter and prompts the user to enter a month, day, and year of birth,
then prints the birthdate in a suitable format.
*/
import java.util.Scanner;

public class C03E20_inputBirthday {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    inputBirthday(console);

  }

  public static void inputBirthday(Scanner console) {
    IO.print("On what day of the month were you born? ");
    int day = console.nextInt();
    IO.print("What is the name of the month in which you were born? ");
    String month = console.next();
    IO.print("During what year were you born? ");
    int year = console.nextInt();
    String print = "You were born on " + month + " " + day + ", " + year + ". You're mighty old!";
    IO.println(print);
  }
}
