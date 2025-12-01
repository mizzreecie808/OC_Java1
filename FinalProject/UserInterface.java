/*
UserInterface:

This is my class that will be where the user interacts with the program inputting the
variables of the loan products they want to compare. Here I will do all my data
validation before sending these details over to LoanDetails which will in turn create
the proper Loan objects, either Simple or Compound interest loans.

Variables to gather:
- principal
- annualRate
- term
- n (frequency at which loan is compounded)

*/
import java.util.Scanner;

public class UserInterface {
  private Scanner reader;

  public UserInterface() {
    this.reader = new Scanner(System.in);
  }

  // Constructing a new set of paramaters "LoanDetails"
  public LoanDetails getLoanDetails() {

    double principal = userPrincipal();
    double rate = userRate();   // will be convereted to decimal in the loan classes
    int term = userTerm();
    int n = userFrequency();

    return new LoanDetails(principal, rate, term, n);
  }

  // -- Helper methods to retrieve and validate user input --
  public double userPrincipal() {
    String prompt = "Enter Loan Principal ($): ";
    double p = -0.1;

    // Validate that the loan amount is greater than 0
    while (p <= 0) {
      System.out.print(prompt);

      if (reader.hasNextDouble()) {
        p = reader.nextDouble();
        if (p <= 0) {
          System.out.println("Error: Principal must be positive amount.");
        }
      } else {
        System.out.println("Error: Invalid input. Please enter a number.");
        reader.next();  // chomp up the bad user input
      }
    }
    return p;
  }

  public double userRate() {
    String prompt = "Enter Annual Interest Rate (e.g. 5 for 5%): ";
    double r = -0.1;

    // Validate that the rate is at least 0% (rare but possible)
    while (r < 0) {
      System.out.print(prompt);

      if (reader.hasNextDouble()) {
        r = reader.nextDouble();
        if (r < 0) {
          System.out.println("Error: Rate must be positive or zero.");
        }
      } else {
        System.out.println("Error: Invalid input. Please enter a number.");
        reader.next();  // chomp up the bad user input
      }
    }
    return r;
  }

  public int userTerm() {
    String prompt = "Enter Loan Term (in full years): ";
    int t = 0;

    // Validate that the term in years is at least 1
    while (t <= 0) {
      System.out.print(prompt);

      if (reader.hasNextInt()) {
        t = reader.nextInt();
        if (t <= 0) {
          System.out.println("Error: Term must be at least 1 year.");
        }
      } else {
        System.out.println("Error: Invalid input. Please enter a whole number.");
        reader.next();  // chomp up the bad user input
      }
    }
    return t;
  }

  public int userFrequency() {
    String prompt = "Enter Compound Frequency (n): (e.g. 12 for Monthly, or 0 if simple interest loan): ";
    int n = -1;

    // Validate that compounding frequency is at least 1 or 0 if simple interest
    while (n < 0) {
      System.out.print(prompt);

      if (reader.hasNextInt()) {
        n = reader.nextInt();
        if (n < 0) {
          System.out.println("Error: Frequency must be positive number or zero.");
        }
      } else {
        System.out.println("Error: Invalid input. Please enter a whole number.");
        reader.next();  // chomp up the bad user input
      }
    }
    return n;
  }

  // Only used for the LoanComparisonApp, this name will NOT be stored with LoanDetails
  public String userLoanName() {
    System.out.print("Enter Loan Name: ");
    String name = reader.nextLine();

    while (name.trim().isEmpty()) {
      System.out.println("Error: Loan name cannot be empty. At a minimum enter (e.g. Loan #1).");
      name = reader.nextLine();
    }
    return name;
  }
}
