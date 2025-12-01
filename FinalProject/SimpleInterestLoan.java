/*
SimpleInterestLoan (Subclass):

This class will inherit "extend" the blueprint from BaseLon and will be forced
to contruct its own methods using the abstract methods provided from BaseLoan.
Loan object is created taking LoanDetails which was received through UserInterface.

*/
public class SimpleInterestLoan extends BaseLoan {

  // Constructor uses the super parent
  public SimpleInterestLoan(LoanDetails loanDetails) {
    super(loanDetails);
  }

  /**
 * formula: Total = P + I
 *
 * @param principal
 * @param intrest (calculateTotalInterest)
 * @return Total Amount of the loan
 */
  public double calculateTotalAmount() {
    double p = loanDetails.getPrincipal();
    double totalInterest = calculateTotalInterest();
    return p + totalInterest;
  }

  /**
 * formula: I = P X R X T
 *
 * @param principal
 * @param annualRate
 * @param term
 * @return total interest over the life of the loan
 */
  public double calculateTotalInterest() {
    double p = loanDetails.getPrincipal();
    double r = loanDetails.getAnnualRate() / 100; // convert to decimal
    int t = loanDetails.getTerm();

    return p * r * t;
  }
}
