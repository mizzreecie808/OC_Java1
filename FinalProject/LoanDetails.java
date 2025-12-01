/*
LoanDetails:

This class will hold the input values, like a container, that the other classes need to
run calculations UserInterface talks to LoanDetails gathering the information about the
loan to then build new loan objects.

To achieve encapsulation and immutability by making the fields private and using getters
and if necessary setters, but no setters for my project don't want any of the details
randomly changed mid calculation

*/
public class LoanDetails {

  // Fields (state)
  private double principal;
  private double annualRate;
  private int term;
  private int n;    // compound frequency, (0 for simple interest loan)

  // Constructor
  public LoanDetails(double principal, double annualRate, int term, int n) {
    this.principal = principal;
    this.annualRate = annualRate;
    this.term = term;
    this.n = n;
  }

  // Getters
  public double getPrincipal() {
    return this.principal;
  }

  public double getAnnualRate() {
    return this.annualRate;
  }

  public int getTerm() {
    return this.term;
  }

  public int getN() {
    return this.n;
  }
}
