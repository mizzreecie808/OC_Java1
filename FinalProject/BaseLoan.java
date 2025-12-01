/*
BaseLoan (Abstract):

This is my loan blueprint for any future loans that I may build in my program.
I currently have the following subclasses which will "extend" this class:
- CompooundInterestLoan
- SimpleInterestLoan
These subclasses will both inherit the LoanDetails, the BaseLoan constructor and will
be required to implement their own concrete methods

Abstract Class:
- Cannot use "new" to create an object of an abstract class
- Can contain abstract methods
- Con contain concrete methods
- Can contain constructors, fields and other class members
- Must be subclassed
- Subclasses must implement abstract methods

Helpful articles that explained abstracton so that I could understand
https://www.datacamp.com/doc/java/abstract
https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

*/
public abstract class BaseLoan {

  // Fields (state)
  protected LoanDetails loanDetails;

  // Constructor
  public BaseLoan(LoanDetails loanDetails) {
    this.loanDetails = loanDetails;
  }

  // These abstract methods must be implemented by the subclasses
  public abstract double calculateTotalAmount();

  public abstract double calculateTotalInterest();

}
