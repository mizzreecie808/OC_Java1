/*
CompoundInterestLoan (Subclass):

This class will inherit "extend" the blueprint from BaseLon and will be forced
to contruct its own methods using the abstract methods provided from BaseLoan.
Loan object is created taking LoanDetails which was received through UserInterface.

*/
public class CompoundInterestLoan extends BaseLoan {

  // Constructor uses the super parent
  public CompoundInterestLoan(LoanDetails loanDetails) {
    super(loanDetails);
  }

  /**
 * formula: A = P(1 + rate / n) ^ n * term
 *
 * @param p (principal)
 * @param annualRate
 * @param term
 * @param n (frequency at which loan is compounded)
 */
  public double calculateTotalAmount() {
    double p = loanDetails.getPrincipal();
    double totalInterest = calculateTotalInterest();
    return p + totalInterest;
  }

  /**
 * formula: I = A - P
 * formula: A = P(1 + rate / n) ^ n * term
 *
 * @param p (principal)
 * @param r (annualRate)
 * @param t (term)
 * @param n (frequency at which loan is compounded)
 * @return total interest over the life of the loan
 */
  public double calculateTotalInterest() {
    double p = loanDetails.getPrincipal();
    double r = loanDetails.getAnnualRate()  / 100; // convert to decimal

    // Must convert to double for Math.pow calculations
    double t = (double) loanDetails.getTerm();
    double n = (double) loanDetails.getN();

    double totalAmount = p * Math.pow((1 + (r / n)),(n * t));

    return totalAmount - p;
  }
}
