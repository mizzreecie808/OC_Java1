/*
LoanComparisonApp:

This will be the driver class that houses the main method

From here a UserInterface object will be created, which gathers user input "LoanDetails"
 and creates new BaseLoan objects (either simple or compound), which are subclasses
of the abstract parent class BaseLoan. Once the Loan objects are created, this app will
compare the two loans and provide an output to the user to let them know which loan
package is a better option.

*/

public class LoanComparisonApp {

  public static void main(String[] args) {

    System.out.println("--- Loan Comparison App ---");

    // 1) create a UserInterface object
    UserInterface ui = new UserInterface();

    // 2) get details from user about the loans, using UserInterface and loanDetails
    System.out.println("--- Loan #1 ---");
    String loanName1 = ui.userLoanName();
    LoanDetails details1 = ui.getLoanDetails();

    System.out.println("--- Loan #2 ---");
    String loanName2 = ui.userLoanName();
    LoanDetails details2 = ui.getLoanDetails();

    // 3) create the loan objects
    BaseLoan loan1 = createLoan(details1);
    BaseLoan loan2 = createLoan(details2);

    // 4) calculate the total cost of each loan
    double total1 = loan1.calculateTotalAmount();
    double interest1 = loan1.calculateTotalInterest();
    double total2 = loan2.calculateTotalAmount();
    double interest2 = loan2.calculateTotalInterest();

    // 5) compare loans and print results
    printSummary(loanName1, total1, interest1);
    printSummary(loanName2, total2, interest2);

    System.out.println("\n--- Recommendation ---");
    if (interest1 == interest2) {
      System.out.println("Both loans will result in the same amount of interest paid.");
    } else if (interest1 < interest2) {
      System.out.println("The better loan is: " + loanName1);
      System.out.printf("Interest paid for %s ($%,.2f) is less than for %s ($%,.2f).\n",
              loanName1, interest1, loanName2, interest2);
    } else {
      System.out.println("The better loan is: " + loanName2);
      System.out.printf("Interest paid for %s ($%,.2f) is less than for %s ($%,.2f).\n",
              loanName2, interest2, loanName1, interest1);
    }
  }

  /**
 * this method will help decide whether the Loan will be simple or compound
 *
 * @param LoanDetails (principal, rate, term, n)
 * @return BaseLoan (either simple or compound), this will use the Interface
 */
  private static BaseLoan createLoan(LoanDetails details) {
    // if there user has entered "0" for compound frequency, then a SimpleInterestLoan
    if (details.getN() == 0) {
      return new SimpleInterestLoan(details);

    // CompoundInterestLoan
    } else {
      return new CompoundInterestLoan(details);
    }
  }

  // helper method to print summary for each loan
  private static void printSummary(String name, double totalAmount, double totalInterest) {
    System.out.println("------------------------------------");
    System.out.println("Loan Name: " + name);

    // I really wanted to OCD the formmating here
    System.out.printf("%-30s $%,12.2f\n", "  Total Interest Paid:", totalInterest);
    System.out.printf("%-30s $%,12.2f\n", "  Total Principal & Interest:", totalAmount);
  }
}
