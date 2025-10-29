import java.util.Scanner;

public class C05_userError {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int age = fetchInt(sc);

  }

  public static int fetchInt(Scanner sc) {
    String prompt = "Type your age: ";
    String wholeNumber = " (Input must be a whole number)\n" + prompt;

    IO.print(prompt);
    while (!sc.hasNextInt()) {
      sc.next();
      IO.print(wholeNumber);
    }
    return sc.nextInt();
  }

  public static int fetchPositiveInt(Scanner sc) {
    int input;
    String prompt = "Type your age: ";
    String wholeNumber = " (Input must be a whole number)\n" + prompt;
    String positiveNumber = " (Input must be a positive number)\n" + prompt;

    do {
      IO.print(prompt);

      // validate for non-integer input
      while (!sc.hasNextInt()) {
        sc.next();
        IO.print(wholeNumber);
      }

      input = sc.nextInt();

      // validate for non-positive number
      if (input <= 0) {
        IO.print(positiveNumber);
      } while (input <= 0); // loop continues as long as the number is NOT positive
    }
    return input;
  }
}
